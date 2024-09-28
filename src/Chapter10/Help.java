package Chapter10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Help {
    String help_file;

    Help(String file_name) {
        help_file = file_name;
    }

    boolean helpOn(String what) {
        int ch;
        String topic, info;

        // Open the help file.
        try (BufferedReader helpRdr =
                     new BufferedReader(new FileReader(help_file))) {
            do {
                // read characters until a # is found
                ch = helpRdr.read();

                // now, see if topics match
                if (ch == '#') {
                    topic = helpRdr.readLine();
                    if (what.compareTo(topic) == 0) { // found topic
                        do {
                            info = helpRdr.readLine();
                            if (info != null) {
                                System.out.println(info);
                            }
                        } while ((info != null) &&
                                (info.compareTo("") != 0));
                        return true;
                    }
                }
            } while (ch != -1);
        } catch (IOException exc) {
            System.out.println("Error accessing help file.");
            return false;
        }
        return false; // topic not found
    }

    String getSelection() {
        String topic = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter topic: ");
        try {
            topic = br.readLine();
        } catch (IOException exc) {
            System.out.println("Error reading console.");
        }
        return topic;
    }
}

class FileHelp {
    public static void main(String[] args) {
        Help hlp_obj = new Help("help_file.txt");
        String topic;

        System.out.println("Try the help system. " + "Enter 'stop' to end.");
        do {
            topic = hlp_obj.getSelection();

            if (!hlp_obj.helpOn(topic))
                System.out.println("Topic not found.\n");

        } while (topic.compareTo("stop") != 0);
    }
}
