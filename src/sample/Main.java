/*
 *
 *  *
 *  *  * Copyright (c) IJSE. All rights reserved.
 *  *  * License under the MIT Licence. See License.txt in the project root for license information.
 *  *
 *
 *
 */

package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/***
 * @author navod <navodsachintha@gmail.com>
 * @since 2/25/2021
 */

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 706, 543));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
