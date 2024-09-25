package Chapter6;

class StaticError {
    static int de_nom = 3;
    static int val = 1024;

    static int val_div_De_nom() {
        return val / de_nom;
    }

    /* Error! Can't access a non-static variable
     from within a static method. */
    // static int val_Div_De_nom() {
    //     return val/de_nom; // won't compile!
    // }
}
