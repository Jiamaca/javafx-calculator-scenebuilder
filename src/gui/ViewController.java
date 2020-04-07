package gui;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import gui.util.Alerts;
import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController implements Initializable{

	@FXML
	private Button btTest;
	
	@FXML
	private Button btSub;
	
	@FXML 
	private Button btMul;
	
	@FXML
	private Button btDiv;
	
	@FXML
	private TextField txtFirstNumber;
	
	@FXML
	private TextField txtSecondNumber;

	@FXML
	private Label labelResult;
	
	@FXML
	private Button btSum;
	
	@FXML
	public void onBtSumAction() {
		try {
			Locale.setDefault(Locale.US);
			double number1 = Double.parseDouble(txtFirstNumber.getText());
			double number2 = Double.parseDouble(txtSecondNumber.getText());
			double sum = number1 + number2;
			labelResult.setText(String.format("%.2f", sum));
		}
		catch(NumberFormatException e) {
			Alerts.showAlert("Error", null, e.getMessage(), AlertType.ERROR);
		}
		
	}
	
	@FXML 
	public void onBtSubAction() {
		try {
			Locale.setDefault(Locale.US);
			double number1 = Double.parseDouble(txtFirstNumber.getText());
			double number2 = Double.parseDouble(txtSecondNumber.getText());
			double min = number1 - number2;
			labelResult.setText(String.format("%.2f", min));
		} catch(NumberFormatException e) {
			Alerts.showAlert("Error", null, e.getMessage(), AlertType.ERROR);
		}
	}

	@FXML 
	public void onBtMulAction() {
		try {
			Locale.setDefault(Locale.US);
			double number1 = Double.parseDouble(txtFirstNumber.getText());
			double number2 = Double.parseDouble(txtSecondNumber.getText());
			double mul = number1 * number2;
			labelResult.setText(String.format("%.2f", mul));
		} catch(NumberFormatException e) {
			Alerts.showAlert("Error", null, e.getMessage(), AlertType.ERROR);
		}
	}
	
	@FXML 
	public void onBtDivAction() {
		try {
			Locale.setDefault(Locale.US);
			double number1 = Double.parseDouble(txtFirstNumber.getText());
			double number2 = Double.parseDouble(txtSecondNumber.getText());
			double div = number1 / number2;
			labelResult.setText(String.format("%.2f", div));
		} catch(NumberFormatException e) {
			Alerts.showAlert("Error", null, e.getMessage(), AlertType.ERROR);
		}
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Constraints.setTextFieldDouble(txtFirstNumber);
		Constraints.setTextFieldDouble(txtSecondNumber);
		Constraints.setTextFieldMaxLength(txtFirstNumber, 12);
		Constraints.setTextFieldMaxLength(txtSecondNumber, 12);
		
	}
}
