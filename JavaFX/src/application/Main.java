package application;
	
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {//Construtor da tela
		try {
			BorderPane root = new BorderPane();//Monta o painel
			Scene scene = new Scene(root,1920,1020);//Tamanho do painel
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());//Determina o estilo, através do CSS, do painel.
			//Podemos aplicar o estilo que desejarmos para a janela por usar o CSS.
			
			GridPane grid = new GridPane();
			grid.setHgap(5.0);
			grid.setVgap(7.0);
			
			grid.add(new Label("Nome"), 0, 0);//Adicionamos um label na posição 0 e 0 (coluna, linha).
			TextField txtNome = new TextField();
			grid.add(txtNome, 1, 0);//Definindo em qual posição estará o campo para inserir texto.
			
			root.setCenter(grid);
			
			grid.add(new Label("Sexo"), 0, 1);
			RadioButton btnMasc = new RadioButton("Masculino");//RadioButton cria uma "bolinha" para ser preenchida.
			RadioButton btnFem = new RadioButton("Feminino");
			btnFem.setSelected(true);//Fazendo com que o botão "Feminino" já esteja selecionado automaticamente.
			
			ToggleGroup group = new ToggleGroup();//Juntará os dois botões num só grupo, a fim de que, ao selecionarmos uma das opções,
			//a outra seja desmarcada.
			btnFem.setToggleGroup(group);
			btnMasc.setToggleGroup(group);

			//Deixando os botões no mesmo lugar visualmente:
			//HBox: coloca elementos numa linha horizontal
			//VBox: coloca elementos numa linha vertical
			
			HBox radioBox = new HBox(5.0, btnFem, btnMasc);//"5.0" = espaço entre cada elemento da linha horizontal
			grid.add(radioBox, 1, 1);
			
			ChoiceBox<String> chcEstados = new ChoiceBox<>(); //Lista para fazer escolhas com elementos do tipo String
			
			ObservableList<String> estados = FXCollections.observableArrayList("São Paulo", "Rio de Janeiro", "Minas Gerais");//Lista
			//com opções observáveis e selecionáveis
			
			chcEstados.setItems(estados);
			
			grid.add(chcEstados, 0, 2);
			
			Label lblTeste = new Label();
			
			Button btnTeste = new Button("Teste");
			
			grid.add(btnTeste, 0, 3);
			grid.add(lblTeste, 0, 4);
			btnTeste.setOnAction(event -> lblTeste.setText("Teste feito"));//setOnAction" - ao pressionar o botão, é gerado um evento.
			//Operador "arrow" - se acontecer um evento faça (->)... no caso, aparecerá uma mensagem: "Teste feito".
			btnTeste.setOnAction(event -> lblTeste.setText(txtNome.getText()));//Exibindo o texto que inserimos no campo "Nome", que está
			//contido em "txtNome". Usamos "txtNome.getText()" para pegar o texto inserido.
			btnTeste.setOnMouseEntered(event -> lblTeste.setText("Passou"));//"Entered": como se fosse o "hover" do CSS. Ao passar o mouse
			//por cima do botão, será exibida a mensagem "Passou".
			btnTeste.setOnMouseExited(event -> lblTeste.setText("Saiu"));//"Exited": ao tirar o mouse de cima do botão, será exibida a
			//mensagem "Saiu".
			
			

			
			
			primaryStage.setScene(scene);//Estágios de abertura de telas.
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);//Aciona o método "start" para construir a tela
	}
}
