module login {
    requires javafx.graphics;
    requires javafx.fxml;
    requires  javafx.controls;

    opens sample; //this is very important but I do not know why
    //requires javafx.graphics;
    //requires javafx.fxml;
}