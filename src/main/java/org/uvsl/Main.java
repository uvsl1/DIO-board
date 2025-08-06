package org.uvsl;

import org.uvsl.persistence.migration.MigrationStrategy;
import org.uvsl.ui.MainMenu;

import java.sql.SQLException;

import static org.uvsl.persistence.config.ConnectionConfig.getConnection;

public class Main {
    public static void main(String[] args) throws SQLException {
        try(var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }
        new MainMenu().execute();
    }
}
