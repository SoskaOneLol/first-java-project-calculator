import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Actions extends CalcGUI{

        static double num1=0, num2=0,result=0;
        static char operator;
        public static class ButtonClickListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                String command = e.getActionCommand();
                if (command.equals("1")) {
                    headerInputOutput.setText(headerInputOutput.getText() + "1");
                }
                if (command.equals("2")) {
                    headerInputOutput.setText(headerInputOutput.getText() + "2");
                }
                if (command.equals("3")) {
                    headerInputOutput.setText(headerInputOutput.getText() + "3");
                }
                if (command.equals("4")) {
                    headerInputOutput.setText(headerInputOutput.getText() + "4");
                }
                if (command.equals("5")) {
                    headerInputOutput.setText(headerInputOutput.getText() + "5");
                }
                if (command.equals("6")) {
                    headerInputOutput.setText(headerInputOutput.getText() + "6");
                }
                if (command.equals("7")) {
                    headerInputOutput.setText(headerInputOutput.getText() + "7");
                }
                if (command.equals("8")) {
                    headerInputOutput.setText(headerInputOutput.getText() + "8");
                }
                if (command.equals("9")) {
                    headerInputOutput.setText(headerInputOutput.getText() + "9");
                }
                if (command.equals("0")) {
                    headerInputOutput.setText(headerInputOutput.getText() + "0");
                }
                if (command.equals("=")) {
                    num2 = Double.parseDouble(headerInputOutput.getText());
                    switch (operator) {
                        case '-':
                            result=num1-num2;
                            break;
                        case '+':
                            result=num1+num2;
                            break;
                        case '/':
                            result=num1/num2;
                            break;
                        case '*':
                            result=num1*num2;
                            break;
                    }
                    headerInputOutput.setText(String.valueOf(result));
                    num1=result;
                }
                if(command.equals("-")){
                    num1 = Double.parseDouble(headerInputOutput.getText());
                    operator = '-';
                    headerInputOutput.setText("");
                }
                if(command.equals("/")){
                    num1 = Double.parseDouble(headerInputOutput.getText());
                    operator = '/';
                    headerInputOutput.setText("");
                }
                if(command.equals("C")){
                    num1 = Double.parseDouble(headerInputOutput.getText());
                    headerInputOutput.setText("");
                }
                if(command.equals("+")){
                    num1 = Double.parseDouble(headerInputOutput.getText());
                    operator = '+';
                    headerInputOutput.setText("");
                }
                if(command.equals("*")){
                    num1 = Double.parseDouble(headerInputOutput.getText());
                    operator = '*';
                    headerInputOutput.setText("");
                }
            }
        }
}
