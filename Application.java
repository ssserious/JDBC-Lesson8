/**
 * Класс Application
 * Класс для размещения точки входа.
 *@author Sergey Sergeev
 *@version 28.12.2021
 */

import java.io.IOException;
import java.sql.SQLException;

import view.WeatherViewer;

public class Application {
    public static void main(String[] args) throws IOException, SQLException {
        // Консольный интерфейс
        WeatherViewer.processCity();

    }
}

