package cor.temp;

import main.Temp;

public interface ITemp {
    /**
     * Lance une IllegalArgument exception si le temp n'est pas reconnu
     * */
    Temp determinerTemp(String temp);
}
