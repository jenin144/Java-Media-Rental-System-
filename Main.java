package application;

import java.util.ArrayList;
import java.util.Date;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class Main extends Application {
	MediaRental a = new MediaRental();

	public void butt(Button s) {
		s.setStyle("-fx-base: maroon;");
		s.setMinSize(80, 80);

	}

	public void bsize(ImageView s) {
		s.setFitWidth(70);
		s.setFitHeight(70);
	}

	public void filltext(Label l) {

		l.setTextFill(Color.MAROON);
		Font font = Font.font("Verdana", FontWeight.EXTRA_BOLD, 20);
		l.setFont(font);

	}

	public void shape(Button s) {
		s.setShape(new Circle());

	}

	public void findd(TextField idc, TextField namec, TextField addressc, TextField mobilec, TextField planc) {

		ArrayList<String> s = new ArrayList<>();

		s = a.searchCustomer(idc.getText());
		namec.setText(s.get(0));
		addressc.setText(s.get(1));
		mobilec.setText(s.get(2));
		planc.setText(s.get(3));

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Rectangle2D screenSize = Screen.getPrimary().getVisualBounds();

		Font font = Font.font("Verdana", FontWeight.EXTRA_BOLD, 40);
		Font font2 = Font.font("white", FontWeight.EXTRA_BOLD, 20);

		GridPane p = new GridPane();
		FlowPane pp = new FlowPane(Orientation.VERTICAL);
		FlowPane ppp = new FlowPane(Orientation.HORIZONTAL);

		ImageView addicon = new ImageView("https://img.icons8.com/ios-filled/344/fa314a/add--v1.png");
		ImageView backicon = new ImageView("https://img.icons8.com/ios-filled/344/fa314a/return.png");
		ImageView findicon = new ImageView("https://img.icons8.com/dotty/344/fa314a/find-and-replace.png");
		ImageView deleteicon = new ImageView("https://img.icons8.com/plasticine/344/fa314a/filled-trash.png");
		ImageView searchicon = new ImageView("https://img.icons8.com/wired/344/fa314a/find-user-male.png");
		ImageView updateicon = new ImageView("https://img.icons8.com/ios-filled/344/fa314a/update-file.png");
		ImageView customer = new ImageView(
				"https://img.icons8.com/external-flatart-icons-outline-flatarticons/344/ffffff/external-customer-design-thinking-and-3d-model-printing-flatart-icons-outline-flatarticons.png");
		ImageView media = new ImageView(
				"https://img.icons8.com/external-itim2101-lineal-itim2101/344/ffffff/external-media-search-itim2101-lineal-itim2101.png");
		ImageView rentt = new ImageView("https://img.icons8.com/glyph-neue/344/ffffff/sell-property.png");
		ImageView photo = new ImageView(
				"https://img.icons8.com/external-outline-geotatah/344/external-company-corporate-social-responsibility-outline-geotatah-3.png");
		ImageView returnicon = new ImageView("https://img.icons8.com/ios-filled/344/fa314a/return-purchase.png");
		ImageView printicon = new ImageView("https://img.icons8.com/wired/344/fa314a/print.png");
		ImageView nexticon = new ImageView("https://img.icons8.com/ios-glyphs/344/fa314a/circled-chevron-right.png");
		ImageView addtocarticon = new ImageView(
				"https://img.icons8.com/external-bearicons-detailed-outline-bearicons/344/fa314a/external-add-to-cart-essential-collection-bearicons-detailed-outline-bearicons.png");
		ImageView process = new ImageView(
				"https://img.icons8.com/external-outline-geotatah/344/fa314a/external-process-datanomics-outline-geotatah.png");

		bsize(addicon);
		bsize(backicon);
		bsize(findicon);
		bsize(deleteicon);
		bsize(searchicon);
		bsize(updateicon);
		bsize(customer);
		bsize(returnicon);
		bsize(printicon);
		bsize(addtocarticon);
		bsize(process);
		bsize(nexticon);
		photo.setScaleX(100);
		photo.setFitWidth(6);
		photo.setFitHeight(5);
		photo.setScaleY(100);

		Button Customer = new Button("Customer", customer);
		customer.setFitWidth(150);
		customer.setFitHeight(130);

		butt(Customer);
		Button Media = new Button("  Media   ", media);
		media.setFitWidth(150);
		media.setFitHeight(130);
		butt(Media);
		Button Rent = new Button("  Rent      ", rentt);
		rentt.setFitWidth(150);
		rentt.setFitHeight(130);
		butt(Rent);
		Label l2 = new Label("Jenin Media Rental System");
		filltext(l2);
		l2.setFont(font);

		p.add(Customer, 0, 0);
		p.add(Media, 0, 1);
		p.add(Rent, 0, 2);
		p.add(l2, 1, 2);
		p.setVgap(100);
		p.setHgap(250);
		pp.getChildren().add(photo);
		ppp.getChildren().addAll(p, pp);
		pp.setPadding(new Insets(210, 50, 100, -280));
		ppp.setPadding(new Insets(50, 100, 50, 100));
		Scene scene = new Scene(ppp, screenSize.getWidth(), screenSize.getHeight());
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		Customer.setOnAction(e -> {///

			FlowPane p2 = new FlowPane(Orientation.VERTICAL);

			Button add = new Button("               Add New Customer               ");
			butt(add);
			Button delete = new Button("                Delete Customer                ");
			butt(delete);
			Button update = new Button("Update Information About Customer");
			butt(update);
			Button search = new Button("          Search a Customer By ID           ");
			butt(search);
			Button return2 = new Button("           Return to Main Page              ");
			butt(return2);

			add.setFont(font2);
			delete.setFont(font2);
			update.setFont(font2);
			search.setFont(font2);
			return2.setFont(font2);
			p2.setPadding(new Insets(60, 400, 130, 140));
			p2.setVgap(50);
			p2.getChildren().addAll(add, delete, update, search, return2);

			Scene ac = new Scene(p2, screenSize.getWidth(), screenSize.getHeight());
			primaryStage.setScene(ac);

			Label id = new Label("Customer Id:");
			filltext(id);
			Label name = new Label("Customer Name:");
			filltext(name);
			Label address = new Label("Customer Address:");
			filltext(address);
			Label mobile = new Label("Customer Mobile:");
			filltext(mobile);
			Label plan = new Label("Customer Plan:");
			filltext(plan);

			Button add2 = new Button("Add", addicon);
			shape(add2);
			Button find = new Button("Find", searchicon);
			shape(find);
			Button delete2 = new Button("Delete", deleteicon);
			shape(delete2);
			Button back = new Button("Back", backicon);
			shape(back);
			Button uupdate = new Button("Update", updateicon);
			shape(uupdate);
			Button searchh = new Button("Search", findicon);
			shape(searchh);

			add.setOnAction(e1 -> {// .............
				GridPane p3 = new GridPane();
				TextField idc = new TextField();
				TextField namec = new TextField();
				TextField addressc = new TextField();
				TextField mobilec = new TextField();
				TextField planc = new TextField();
				namec.setDisable(true);
				addressc.setDisable(true);
				mobilec.setDisable(true);
				planc.setDisable(true);

				p3.add(id, 0, 0);
				p3.add(name, 0, 1);
				p3.add(address, 0, 2);
				p3.add(mobile, 0, 3);
				p3.add(plan, 0, 4);
				p3.add(idc, 1, 0);
				p3.add(namec, 1, 1);
				p3.add(addressc, 1, 2);
				p3.add(mobilec, 1, 3);
				p3.add(planc, 1, 4);
				p3.add(add2, 0, 5);
				p3.add(back, 1, 5);

				p3.setPadding(new Insets(130, -400, 150, 500));
				p3.setVgap(80);
				p3.setHgap(70);
				Scene ac2 = new Scene(p3, screenSize.getWidth(), screenSize.getHeight());
				primaryStage.setScene(ac2);
				idc.setOnKeyTyped(e3 -> namec.setDisable(false));
				namec.setOnKeyTyped(e3 -> addressc.setDisable(false));
				addressc.setOnKeyTyped(e3 -> mobilec.setDisable(false));
				mobilec.setOnKeyTyped(e3 -> planc.setDisable(false));

				add2.setOnAction(e2 -> {

					a.addCustomer(idc.getText(), namec.getText(), mobilec.getText(), addressc.getText(),
							planc.getText());
					idc.clear();
					namec.clear();
					addressc.clear();
					mobilec.clear();
					planc.clear();
				});

				back.setOnAction(e3 -> {
					primaryStage.setScene(ac);

				});

			});

			delete.setOnAction(e2 -> {// ...........................

				GridPane p3 = new GridPane();
				TextField idc = new TextField();
				TextField namec = new TextField();
				TextField addressc = new TextField();
				TextField mobilec = new TextField();
				TextField planc = new TextField();

				p3.add(id, 0, 0);
				p3.add(name, 0, 1);
				p3.add(address, 0, 2);
				p3.add(mobile, 0, 3);
				p3.add(plan, 0, 4);
				p3.add(idc, 1, 0);
				p3.add(namec, 1, 1);
				p3.add(addressc, 1, 2);
				p3.add(mobilec, 1, 3);
				p3.add(planc, 1, 4);
				p3.add(find, 0, 5);
				p3.add(delete2, 1, 5);
				p3.add(back, 2, 5);

				p3.setPadding(new Insets(130, -400, 150, 500));
				p3.setVgap(80);
				p3.setHgap(70);
				Scene ac2 = new Scene(p3, screenSize.getWidth(), screenSize.getHeight());
				namec.setDisable(true);
				addressc.setDisable(true);
				mobilec.setDisable(true);
				planc.setDisable(true);

				idc.setOnKeyTyped(e3 -> namec.setDisable(false));
				namec.setOnKeyTyped(e3 -> addressc.setDisable(false));
				addressc.setOnKeyTyped(e3 -> mobilec.setDisable(false));
				mobilec.setOnKeyTyped(e3 -> planc.setDisable(false));

				delete2.setOnAction(e3 -> {

					a.deleteCustomer(idc.getText(), namec.getText(), mobilec.getText(), addressc.getText(),
							planc.getText());

				});

				find.setOnAction(e3 -> {
					findd(idc, namec, mobilec, addressc, planc);
					namec.setDisable(false);
					addressc.setDisable(false);
					mobilec.setDisable(false);
					planc.setDisable(false);

				});

				back.setOnAction(e3 -> primaryStage.setScene(ac));

				primaryStage.setScene(ac2);

			});

			update.setOnAction(e2 -> {// ..............................
				GridPane p3 = new GridPane();
				TextField idc = new TextField();
				TextField namec = new TextField();
				TextField addressc = new TextField();
				TextField mobilec = new TextField();
				TextField planc = new TextField();

				p3.add(id, 0, 0);
				p3.add(name, 0, 1);
				p3.add(address, 0, 2);
				p3.add(mobile, 0, 3);
				p3.add(plan, 0, 4);
				p3.add(idc, 1, 0);
				p3.add(namec, 1, 1);
				p3.add(addressc, 1, 2);
				p3.add(mobilec, 1, 3);
				p3.add(planc, 1, 4);
				p3.add(find, 0, 5);
				p3.add(uupdate, 1, 5);
				p3.add(back, 2, 5);

				p3.setPadding(new Insets(130, -400, 150, 500));
				p3.setVgap(80);
				p3.setHgap(70);
				Scene ac2 = new Scene(p3, screenSize.getWidth(), screenSize.getHeight());
				namec.setDisable(true);
				addressc.setDisable(true);
				mobilec.setDisable(true);
				planc.setDisable(true);

				idc.setOnKeyTyped(e3 -> namec.setDisable(false));
				namec.setOnKeyTyped(e3 -> addressc.setDisable(false));
				addressc.setOnKeyTyped(e3 -> mobilec.setDisable(false));
				mobilec.setOnKeyTyped(e3 -> planc.setDisable(false));

				uupdate.setOnAction(e3 -> {
					a.updatec(idc.getText(), namec.getText(), mobilec.getText(), addressc.getText(), planc.getText());

				});
				find.setOnAction(e3 -> {
					findd(idc, namec, mobilec, addressc, planc);
					namec.setDisable(false);
					addressc.setDisable(false);
					mobilec.setDisable(false);
					planc.setDisable(false);

				});

				back.setOnAction(e3 -> primaryStage.setScene(ac));
			

				primaryStage.setScene(ac2);

			});

			search.setOnAction(e2 -> {// ................................

				GridPane p3 = new GridPane();
				TextField idc = new TextField();
				TextField namec = new TextField();
				TextField addressc = new TextField();
				TextField mobilec = new TextField();
				TextField planc = new TextField();

				p3.add(id, 0, 0);
				p3.add(name, 0, 1);
				p3.add(address, 0, 2);
				p3.add(mobile, 0, 3);
				p3.add(plan, 0, 4);
				p3.add(idc, 1, 0);
				p3.add(namec, 1, 1);
				p3.add(addressc, 1, 2);
				p3.add(mobilec, 1, 3);
				p3.add(planc, 1, 4);
				p3.add(searchh, 1, 5);
				p3.add(back, 2, 5);

				p3.setPadding(new Insets(130, -400, 150, 500));
				p3.setVgap(80);
				p3.setHgap(70);
				Scene ac2 = new Scene(p3, screenSize.getWidth(), screenSize.getHeight());
				primaryStage.setScene(ac2);

				searchh.setOnAction(e3 -> {

					findd(idc, namec, mobilec, addressc, planc);

				});
				back.setOnAction(e3 -> primaryStage.setScene(ac));
				primaryStage.setScene(ac2);

			});

			return2.setOnAction(e2 -> primaryStage.setScene(scene));// ......................

		});
		

//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		Media.setOnAction(e -> {

			FlowPane p2 = new FlowPane(Orientation.VERTICAL);

			Button add = new Button("               Add New Media              ");
			butt(add);
			Button delete = new Button("                Delete Media                 ");
			butt(delete);
			Button update = new Button("Update Information About Media ");
			butt(update);
			Button search = new Button("         Search A Media By Code       ");
			butt(search);
			Button print = new Button("         Print All Media Information   ");
			butt(print);
			Button returnn = new Button("           Return To Main Page           ");
			butt(returnn);
			add.setFont(font2);
			delete.setFont(font2);
			update.setFont(font2);
			search.setFont(font2);
			returnn.setFont(font2);
			print.setFont(font2);

			p2.setPadding(new Insets(60, 120, 100, 140));
			p2.setVgap(30);
			p2.getChildren().addAll(add, delete, update, search, print, returnn);

			Label type = new Label("Media type");
			filltext(type);
			Label code = new Label("Media code");
			filltext(code);
			Label title = new Label("Media Title ");
			filltext(title);
			Label numberofcopies = new Label("Number Of Copies");
			filltext(numberofcopies);
			Label lrating = new Label("rating");
			filltext(lrating);
			Label lartist = new Label("artist");
			filltext(lartist);
			Label lsongs = new Label("songs");
			filltext(lsongs);
			Label lweight = new Label("weight");
			filltext(lweight);
			Button addm = new Button("Add", addicon);
			shape(addm);
			Button continuee = new Button("Next", nexticon);
			shape(continuee);
			Button backm = new Button("Back", backicon);
			shape(backm);
			Button deletem = new Button("delete", deleteicon);
			shape(deletem);
			Button updatem = new Button("update", updateicon);
			shape(updatem);
			Button searchm = new Button("search", findicon);
			shape(searchm);
			Button findm = new Button("Find", searchicon);
			shape(findm);

			TextField trating = new TextField();
			TextField tweight = new TextField();
			TextField tartist = new TextField();
			TextField tsongs = new TextField();
			TextField codem = new TextField();
			TextField titlem = new TextField();
			TextField numberofcopiesm = new TextField();

			ComboBox<String> typem = new ComboBox<>();
			typem.getItems().addAll("Movie", "Album", "Game");

			Scene ac = new Scene(p2, screenSize.getWidth(), screenSize.getHeight());
			primaryStage.setScene(ac);

			add.setOnAction(e2 -> {// ...............................

				GridPane p3 = new GridPane();

				p3.add(type, 0, 0);
				p3.add(code, 0, 1);
				p3.add(title, 0, 2);
				p3.add(numberofcopies, 0, 3);
				p3.add(typem, 1, 0);
				p3.add(codem, 1, 1);
				p3.add(titlem, 1, 2);
				p3.add(numberofcopiesm, 1, 3);
				p3.add(addm, 1, 5);
				p3.add(backm, 2, 5);
				p3.add(continuee, 1, 5);
				p3.add(lrating, 2, 0);
				p3.add(trating, 3, 0);
				p3.add(lweight, 2, 1);
				p3.add(tweight, 3, 1);
				p3.add(lartist, 2, 2);
				p3.add(tartist, 3, 2);
				p3.add(lsongs, 2, 3);
				p3.add(tsongs, 3, 3);
				lrating.setVisible(false);
				trating.setVisible(false);
				lweight.setVisible(false);
				tweight.setVisible(false);
				lartist.setVisible(false);
				tartist.setVisible(false);
				lsongs.setVisible(false);
				tsongs.setVisible(false);
				addm.setVisible(false);

				p3.setPadding(new Insets(130, -400, 150, 500));
				p3.setVgap(80);
				p3.setHgap(70);
				Scene ac2 = new Scene(p3, screenSize.getWidth(), screenSize.getHeight());
				primaryStage.setScene(ac2);
				codem.setDisable(true);
				titlem.setDisable(true);
				numberofcopiesm.setDisable(true);
				tsongs.setDisable(true);

				typem.setOnAction(e3 -> codem.setDisable(false));
				codem.setOnKeyTyped(e3 -> titlem.setDisable(false));
				titlem.setOnKeyTyped(e3 -> numberofcopiesm.setDisable(false));
				tartist.setOnKeyTyped(e3 -> tsongs.setDisable(false));

				continuee.setOnAction(e4 -> {
					if (typem.getValue() == "Movie") {
						lrating.setVisible(true);
						trating.setVisible(true);
						lweight.setVisible(false);
						tweight.setVisible(false);
						lartist.setVisible(false);
						tartist.setVisible(false);
						lsongs.setVisible(false);
						tsongs.setVisible(false);
						addm.setVisible(true);
						continuee.setVisible(false);
					}

					else if (typem.getValue() == "Game") {
						lweight.setVisible(true);
						tweight.setVisible(true);
						lrating.setVisible(false);
						trating.setVisible(false);
						lartist.setVisible(false);
						tartist.setVisible(false);
						lsongs.setVisible(false);
						tsongs.setVisible(false);
						addm.setVisible(true);
						continuee.setVisible(false);
					}

					else {
						lsongs.setVisible(true);
						tsongs.setVisible(true);
						lartist.setVisible(true);
						tartist.setVisible(true);
						lrating.setVisible(false);
						trating.setVisible(false);
						lweight.setVisible(false);
						tweight.setVisible(false);
						addm.setVisible(true);
						continuee.setVisible(false);
					}

				});

				addm.setOnAction(e3 -> {

					if (typem.getValue() == "Movie") {

						a.addMovie(codem.getText(), titlem.getText(), Integer.parseInt(numberofcopiesm.getText()),
								trating.getText());
					}

					else if (typem.getValue() == "Game") {

						a.addGame(codem.getText(), titlem.getText(), Integer.parseInt(numberofcopiesm.getText()),
								tweight.getText());
					}

					else {

						a.addAlbum(codem.getText(), titlem.getText(), Integer.parseInt(numberofcopiesm.getText()),
								tartist.getText(), tsongs.getText());
					}

					codem.clear();
					titlem.clear();
					numberofcopiesm.clear();
					trating.clear();
					tweight.clear();
					tartist.clear();
					tsongs.clear();
					typem.setValue(null);
					continuee.setVisible(true);
					lsongs.setVisible(false);
					tsongs.setVisible(false);
					lartist.setVisible(false);
					tartist.setVisible(false);
					lrating.setVisible(false);
					trating.setVisible(false);
					lweight.setVisible(false);
					tweight.setVisible(false);
					addm.setVisible(false);
					codem.setDisable(true);
					titlem.setDisable(true);
					numberofcopiesm.setDisable(true);
					tsongs.setDisable(true);

					typem.setOnAction(e4 -> codem.setDisable(false));
					codem.setOnKeyTyped(e4 -> titlem.setDisable(false));
					titlem.setOnKeyTyped(e4 -> numberofcopiesm.setDisable(false));
					tartist.setOnKeyTyped(e4 -> tsongs.setDisable(false));

				});

				backm.setOnAction(e3 -> {
					primaryStage.setScene(ac);
					continuee.setVisible(true);
					addm.setVisible(false);
					codem.clear();
					titlem.clear();
					numberofcopiesm.clear();
					trating.clear();
					tweight.clear();
					tartist.clear();
					tsongs.clear();
					typem.setValue(null);

				});
			});

			delete.setOnAction(e2 -> {// .............................
				GridPane p3 = new GridPane();

				p3.add(type, 0, 0);
				p3.add(code, 0, 1);
				p3.add(title, 0, 2);
				p3.add(numberofcopies, 0, 3);
				p3.add(typem, 1, 0);
				p3.add(codem, 1, 1);
				p3.add(titlem, 1, 2);
				p3.add(numberofcopiesm, 1, 3);
				p3.add(findm, 0, 5);
				p3.add(deletem, 1, 5);
				p3.add(backm, 2, 5);

				p3.setPadding(new Insets(130, -400, 150, 500));
				p3.setVgap(80);
				p3.setHgap(70);
				Scene ac2 = new Scene(p3, screenSize.getWidth(), screenSize.getHeight());
				primaryStage.setScene(ac2);
				codem.setDisable(true);
				titlem.setDisable(true);
				numberofcopiesm.setDisable(true);
				tsongs.setDisable(true);

				findm.setOnAction(e3 -> {
					ArrayList<String> s = new ArrayList<>();
					s = a.searchMedia(codem.getText());
					titlem.setText(s.get(1));
					numberofcopiesm.setText(s.get(2));

				});

				deletem.setOnAction(e3 -> {
					a.deleteMedia(codem.getText());
					codem.clear();
					titlem.clear();
					numberofcopiesm.clear();
					trating.clear();
					tweight.clear();
					tartist.clear();
					tsongs.clear();
					typem.setValue(null);

				});

				backm.setOnAction(e3 -> {
					primaryStage.setScene(ac);
					codem.clear();
					titlem.clear();
					numberofcopiesm.clear();
					typem.setValue(null);

					trating.clear();
					tweight.clear();
					tartist.clear();
					tsongs.clear();
				});

			});

			update.setOnAction(e2 -> {// ........................
				GridPane p3 = new GridPane();

				p3.add(type, 0, 0);
				p3.add(code, 0, 1);
				p3.add(title, 0, 2);
				p3.add(numberofcopies, 0, 3);
				p3.add(typem, 1, 0);
				p3.add(codem, 1, 1);
				p3.add(titlem, 1, 2);
				p3.add(numberofcopiesm, 1, 3);
				p3.add(findm, 0, 5);
				p3.add(updatem, 1, 5);
				p3.add(backm, 2, 5);
				p3.add(lrating, 2, 0);
				p3.add(trating, 3, 0);
				p3.add(lweight, 2, 1);
				p3.add(tweight, 3, 1);
				p3.add(lartist, 2, 2);
				p3.add(tartist, 3, 2);
				p3.add(lsongs, 2, 3);
				p3.add(tsongs, 3, 3);
				lrating.setVisible(false);
				trating.setVisible(false);
				lweight.setVisible(false);
				tweight.setVisible(false);
				lartist.setVisible(false);
				tartist.setVisible(false);
				lsongs.setVisible(false);
				tsongs.setVisible(false);
				addm.setVisible(false);

				p3.setPadding(new Insets(130, -400, 150, 500));
				p3.setVgap(80);
				p3.setHgap(70);
				Scene ac2 = new Scene(p3, screenSize.getWidth(), screenSize.getHeight());
				codem.setDisable(true);
				titlem.setDisable(true);
				numberofcopiesm.setDisable(true);
				tsongs.setDisable(true);

				primaryStage.setScene(ac2);

				updatem.setOnAction(e3 -> {

					if (typem.getValue() == "Movie") {
						a.updatem(codem.getText(), titlem.getText(), Integer.parseInt(numberofcopiesm.getText()),
								trating.getText(), "", "", "");

					}

					else if (typem.getValue() == "Album") {
						a.updatem(codem.getText(), titlem.getText(), Integer.parseInt(numberofcopiesm.getText()), "",
								"", tartist.getText(), tsongs.getText());

					} else {
						a.updatem(codem.getText(), titlem.getText(), Integer.parseInt(numberofcopiesm.getText()), "l",
								tweight.getText(), "l", "l");

					}

					codem.clear();
					titlem.clear();
					numberofcopiesm.clear();
					trating.clear();
					tweight.clear();
					tartist.clear();
					tsongs.clear();
					typem.setValue(null);

				});

				findm.setOnAction(e3 -> {
					ArrayList<String> s = new ArrayList<>();
					s = a.searchMedia(codem.getText());
					titlem.setText(s.get(1));
					numberofcopiesm.setText(s.get(2));

					if (typem.getValue() == "Movie") {

						trating.setText(s.get(3));

						lrating.setVisible(true);
						trating.setVisible(true);
						lweight.setVisible(false);
						tweight.setVisible(false);
						lartist.setVisible(false);
						tartist.setVisible(false);
						lsongs.setVisible(false);
						tsongs.setVisible(false);
					}

					else if (typem.getValue() == "Game") {
						tweight.setText(s.get(3));

						lweight.setVisible(true);
						tweight.setVisible(true);
						lrating.setVisible(false);
						trating.setVisible(false);
						lartist.setVisible(false);
						tartist.setVisible(false);
						lsongs.setVisible(false);
						tsongs.setVisible(false);
					}

					else {

						tartist.setText(s.get(3));
						tsongs.setText(s.get(4));

						lsongs.setVisible(true);
						tsongs.setVisible(true);
						lartist.setVisible(true);
						tartist.setVisible(true);
						lrating.setVisible(false);
						trating.setVisible(false);
						lweight.setVisible(false);
						tweight.setVisible(false);
					}

				});

				backm.setOnAction(e3 -> {
					primaryStage.setScene(ac);
					codem.clear();
					titlem.clear();
					numberofcopiesm.clear();
					trating.clear();
					tweight.clear();
					tartist.clear();
					tsongs.clear();
					typem.setValue(null);

				});
			});

			search.setOnAction(e2 -> {// .........................
				BorderPane p33 = new BorderPane();
				GridPane p3 = new GridPane();

				TextArea area = new TextArea();

				p3.add(code, 0, 0);
				p3.add(codem, 1, 0);
				p3.add(typem, 2, 0);
				p3.add(searchm, 3, 0);
				p3.add(backm, 4, 0);

				p33.setPadding(new Insets(50, 60, 70, 80));
				p3.setPadding(new Insets(50, -200, 50, 250));
				p3.setVgap(10);
				p3.setHgap(80);

				Scene ac2 = new Scene(p3, screenSize.getWidth(), screenSize.getHeight());
				codem.setDisable(true);
				titlem.setDisable(true);
				numberofcopiesm.setDisable(true);
				tsongs.setDisable(true);

				primaryStage.setScene(ac2);

				searchm.setOnAction(e3 -> {

					ArrayList<String> s2 = new ArrayList<>();
					s2 = a.searchMedia(codem.getText());

					if (!s2.isEmpty()) {
						if (typem.getValue() == "Movie") {

							area.setText("Media Code" + s2.get(0) + " \n" + "Media Title: " + s2.get(1) + " \n"
									+ "Number Of Copies: " + s2.get(2) + " \n" + "Rating: " + s2.get(3));
						}

						else if (typem.getValue() == "Game") {
							area.setText("Media Code: " + s2.get(0) + " \n" + "Media Title: " + s2.get(1) + " \n"
									+ "Number Of Copies: " + s2.get(2) + " \n" + "Weight : " + s2.get(3));
						} else {
							area.setText("Media Code : " + s2.get(0) + " \n" + "Media Title : " + s2.get(1) + " \n"
									+ "Number Of Copies : " + s2.get(2) + " \n" + "Artist : " + s2.get(3) + " \n"
									+ "Songs : " + s2.get(4));
						}
					} else {
						area.setText("Error!!!! the media you searched doesen't exist");
					}
					p33.setTop(p3);
					p33.setCenter(area);
					Scene ac22 = new Scene(p33, screenSize.getWidth(), screenSize.getHeight());
					primaryStage.setScene(ac22);
					codem.clear();
				});

				backm.setOnAction(e3 -> {
					primaryStage.setScene(ac);
					codem.clear();
					titlem.clear();
					numberofcopiesm.clear();
					trating.clear();
					tweight.clear();
					tartist.clear();
					tsongs.clear();
					typem.setValue(null);

				});
			});

			print.setOnAction(e2 -> {// ...............
				TextArea a2 = new TextArea();

				a2.setText(a.getAllMediaInfo());
				BorderPane p33 = new BorderPane();
				GridPane p3 = new GridPane();

				p3.add(backm, 0, 0);
				p33.setPadding(new Insets(100, 100, 100, 100));
				p33.setRight(p3);
				p33.setCenter(a2);
				Scene ac22 = new Scene(p33, screenSize.getWidth(), screenSize.getHeight());
				primaryStage.setScene(ac22);

				backm.setOnAction(e3 -> {
					primaryStage.setScene(ac);

				});

				primaryStage.setScene(ac22);

			});
			returnn.setOnAction(e2 -> primaryStage.setScene(scene));// ............

		});
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		Rent.setOnAction(e -> {
			FlowPane p2 = new FlowPane(Orientation.VERTICAL);

			Button rent = new Button("                       Rent                      ");
			butt(rent);
			Button pintersted = new Button("Print Intersted Media In The Cart");
			butt(pintersted);
			Button prented = new Button("Print Rented Media In The Cart   ");
			butt(prented);
			Button returnmedia = new Button("       Return Rented Media           ");
			butt(returnmedia);
			Button return2 = new Button("        Return To Main Page           ");
			butt(return2);
			rent.setFont(font2);
			pintersted.setFont(font2);
			prented.setFont(font2);
			returnmedia.setFont(font2);
			return2.setFont(font2);

			p2.setPadding(new Insets(60, 400, 130, 140));
			p2.setVgap(50);
			p2.getChildren().addAll(rent, pintersted, prented, returnmedia, return2);
			Button print = new Button("Print", printicon);
			shape(print);
			Button back = new Button(" Back", backicon);
			shape(back);
			Button returnm = new Button("Return", returnicon);
			shape(returnm);

			Label id = new Label(" ID : ");
			filltext(id);

			TextField idc = new TextField();
			Label code = new Label("CODE  : ");
			filltext(code);
			TextField codec = new TextField();

			Scene ac = new Scene(p2, screenSize.getWidth(), screenSize.getHeight());
			primaryStage.setScene(ac);

			rent.setOnAction(e2 -> {
				FlowPane p22 = new FlowPane();
				GridPane p1 = new GridPane();
				TextArea infc = new TextArea();
				TextArea infm = new TextArea();
				TextField date = new TextField();
				Button addtocart = new Button("Add to cart", addtocarticon);
				shape(addtocart);
				Button processcart = new Button(" process cart", process);
				shape(processcart);
				Button searchc = new Button("", searchicon);
				shape(searchc);
				Button searchm = new Button(" ", findicon);
				shape(searchm);
				Label renteddate = new Label("Rented Date :");
				filltext(renteddate);

				infc.setMaxSize(800, 240);
				infm.setMaxSize(800, 240);
				idc.setMaxSize(100, 30);
				codec.setMaxSize(100, 30);
				date.setMaxSize(300, 50);
				p22.getChildren().addAll(addtocart, processcart, back);
				p22.setHgap(25);

				p1.add(id, 0, 0);
				p1.add(idc, 1, 0);
				p1.add(searchc, 2, 0);
				p1.add(infc, 1, 2);
				p1.add(code, 0, 4);
				p1.add(codec, 1, 4);
				p1.add(searchm, 2, 4);
				p1.add(infm, 1, 5);
				p1.add(renteddate, 0, 6);
				p1.add(date, 1, 6);
				p1.add(p22, 1, 8);
				p1.setPadding(new Insets(50, 0, 30, 200));
				p1.setVgap(10);
				p1.setHgap(100);
				date.setText(new Date().toString());

				Scene ac22 = new Scene(p1, screenSize.getWidth(), screenSize.getHeight());
				primaryStage.setScene(ac22);
				codec.setDisable(true);
				idc.setOnKeyTyped(e3 -> codec.setDisable(false));

				searchc.setOnAction(e3 -> {

					infc.setText(a.printcusomerinfo(idc.getText()));

				});

				searchm.setOnAction(e3 -> {
					infm.setText(a.printmediainfo(codec.getText()));

				});

				addtocart.setOnAction(e3 -> {
					a.addTocart(idc.getText(), codec.getText());

				});

				processcart.setOnAction(e3 -> {
					a.processRequests();

				});

				back.setOnAction(e3 -> {
					primaryStage.setScene(ac);
					codec.clear();
					idc.clear();
				});

			});
			pintersted.setOnAction(e2 -> {

				BorderPane p33 = new BorderPane();
				GridPane p3 = new GridPane();
				TextArea printed = new TextArea();

				p3.add(id, 0, 0);
				p3.add(idc, 1, 0);
				p3.add(print, 2, 0);
				p3.add(back, 3, 0);

				p3.setVgap(30);
				p3.setHgap(80);
				p33.setTop(p3);
				p33.setCenter(printed);
				p3.setPadding(new Insets(11, 12, 13, 14));
				p33.setPadding(new Insets(50, 50, 50, 50));

				Scene ac22 = new Scene(p33, screenSize.getWidth(), screenSize.getHeight());
				primaryStage.setScene(ac22);

				print.setOnAction(e3 -> {
					printed.setText(a.print(idc.getText(), 0).toString());
				});

				back.setOnAction(e3 -> {
					primaryStage.setScene(ac);
					codec.clear();
					idc.clear();
				});
			});
			prented.setOnAction(e2 -> {
				BorderPane p33 = new BorderPane();
				GridPane p3 = new GridPane();
				TextArea printed = new TextArea();

				p3.add(id, 0, 0);
				p3.add(idc, 1, 0);
				p3.add(print, 2, 0);
				p3.add(back, 3, 0);

				p3.setVgap(30);
				p3.setHgap(80);
				p33.setTop(p3);
				p33.setCenter(printed);
				p3.setPadding(new Insets(11, 12, 13, 14));
				p33.setPadding(new Insets(50, 52, 50, 50));

				Scene ac22 = new Scene(p33, screenSize.getWidth(), screenSize.getHeight());
				primaryStage.setScene(ac22);

				print.setOnAction(e3 -> {
					printed.setText(a.print(idc.getText(), 1).toString());

				});

				back.setOnAction(e3 -> {
					primaryStage.setScene(ac);
					codec.clear();
					idc.clear();
				});
			});
			returnmedia.setOnAction(e2 -> {

				BorderPane p33 = new BorderPane();
				GridPane p3 = new GridPane();
				TextArea printed = new TextArea();

				p3.add(id, 0, 0);
				p3.add(idc, 1, 0);
				p3.add(code, 0, 1);
				p3.add(codec, 1, 1);
				p3.add(returnm, 3, 1);
				p3.add(back, 5, 1);

				p3.setVgap(25);
				p3.setHgap(34);
				p33.setTop(p3);
				p33.setCenter(printed);
				p3.setPadding(new Insets(11, 12, 13, 14));
				p33.setPadding(new Insets(40, 40, 50, 40));
				codec.setDisable(true);
				idc.setOnKeyTyped(e3 -> codec.setDisable(false));
				Scene ac22 = new Scene(p33, screenSize.getWidth(), screenSize.getHeight());
				primaryStage.setScene(ac22);

				returnm.setOnAction(e3 -> {

					if (a.returnMedia(idc.getText(), codec.getText())) {
						printed.setText("Media code " + codec.getText() + " is returned");

					} else
						printed.setText("Media code not found");

				});

				back.setOnAction(e3 -> {
					primaryStage.setScene(ac);
					codec.clear();
					idc.clear();
				});
			});

			return2.setOnAction(e2 -> primaryStage.setScene(scene));
		});

//...........................................................................
		primaryStage.setTitle("Media rental");
		primaryStage.setMaximized(true);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
