package fx;

import calculator.Calculator;
import calculator.basic.BasicCalculator;
import calculator.basic.Keys;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class BasicCalcController {
    private Calculator calculator = new BasicCalculator();

    @FXML
    private TextField display;
    @FXML
    private Button keyZero;
    @FXML
    private Button keyOne;
    @FXML
    private Button keyTwo;
    @FXML
    private Button keyThree;
    @FXML
    private Button keyFour;
    @FXML
    private Button keyFive;
    @FXML
    private Button keySix;
    @FXML
    private Button keySeven;
    @FXML
    private Button keyEight;
    @FXML
    private Button keyNine;
    @FXML
    private Button keyEqual;
    @FXML
    private Button keyDot;
    @FXML
    private Button keyAddition;
    @FXML
    private Button keySubtract;
    @FXML
    private Button keyMultiply;
    @FXML
    private Button keyDivision;
    @FXML
    private Button keyPercentage;
    @FXML
    private Button keySignum;
    @FXML
    private Button keyAC;

    @FXML
    private void keyZeroPress(ActionEvent event) {
        calculator.pressKey(Keys.ZERO.getSymbol());
        display.setText(calculator.getDisplay());
    }

    @FXML
    private void keyOnePress(ActionEvent event) {
        calculator.pressKey(Keys.ONE.getSymbol());
        display.setText(calculator.getDisplay());
    }

    @FXML
    private void keyTwoPress(ActionEvent event) {
        calculator.pressKey(Keys.TWO.getSymbol());
        display.setText(calculator.getDisplay());
    }

    @FXML
    private void keyThreePress(ActionEvent event) {
        calculator.pressKey(Keys.THREE.getSymbol());
        display.setText(calculator.getDisplay());
    }

    @FXML
    private void keyFourPress(ActionEvent event) {
        calculator.pressKey(Keys.FOUR.getSymbol());
        display.setText(calculator.getDisplay());
    }

    @FXML
    private void keyFivePress(ActionEvent event) {
        calculator.pressKey(Keys.FIVE.getSymbol());
        display.setText(calculator.getDisplay());
    }

    @FXML
    private void keySixPress(ActionEvent event) {
        calculator.pressKey(Keys.SIX.getSymbol());
        display.setText(calculator.getDisplay());
    }

    @FXML
    private void keySevenPress(ActionEvent event) {
        calculator.pressKey(Keys.SEVEN.getSymbol());
        display.setText(calculator.getDisplay());
    }

    @FXML
    private void keyEightPress(ActionEvent event) {
        calculator.pressKey(Keys.EIGHT.getSymbol());
        display.setText(calculator.getDisplay());
    }

    @FXML
    private void keyNinePress(ActionEvent event) {
        calculator.pressKey(Keys.NINE.getSymbol());
        display.setText(calculator.getDisplay());
    }

    @FXML
    private void keyDotPress(ActionEvent event) {
        calculator.pressKey(Keys.DOT.getSymbol());
        display.setText(calculator.getDisplay());
    }

    @FXML
    private void keyEqualPress(ActionEvent event) {
        calculator.pressKey(Keys.EQUAL.getSymbol());
        display.setText(calculator.getDisplay());
    }

    @FXML
    private void keyAddPress(ActionEvent event) {
        calculator.pressKey(Keys.ADD.getSymbol());
        display.setText(calculator.getDisplay());
    }

    @FXML
    private void keySubtractPress(ActionEvent event) {
        calculator.pressKey(Keys.SUBTRACT.getSymbol());
        display.setText(calculator.getDisplay());
    }

    @FXML
    private void keyMultiplyPress(ActionEvent event) {
        calculator.pressKey(Keys.MULTIPLY.getSymbol());
        display.setText(calculator.getDisplay());
    }

    @FXML
    private void keyDivisionPress(ActionEvent event) {
        calculator.pressKey(Keys.DIVISION.getSymbol());
        display.setText(calculator.getDisplay());
    }

    @FXML
    private void keyACPress(ActionEvent event) {
        calculator.pressKey(Keys.AC.getSymbol());
        display.setText(calculator.getDisplay());
    }

    @FXML
    private void keySignumPress(ActionEvent event) {
        calculator.pressKey(Keys.SIGNUM.getSymbol());
        display.setText(calculator.getDisplay());
    }

    @FXML
    private void keyPercentPress(ActionEvent event) {
        calculator.pressKey(Keys.PERCENTAGE.getSymbol());
        display.setText(calculator.getDisplay());
    }
}
