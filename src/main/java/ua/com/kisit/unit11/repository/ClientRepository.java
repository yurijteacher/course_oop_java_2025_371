package ua.com.kisit.unit11.repository;

import ua.com.kisit.unit11.confin.ConnectionToDB;
import ua.com.kisit.unit11.dao.ClientDao;
import ua.com.kisit.unit11.entity.Client;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientRepository extends ConnectionToDB implements ClientDao {

    Connection connection = null;

    public ClientRepository() {
        this.connection = getConnection();
    }


    @Override
    public void save(Client client) {

        CallableStatement cs = null;


        try {
                cs = connection.prepareCall("{call saveNewClient(?,?)}");
                cs.setString(1, client.getUsername());
                cs.setString(2, client.getPassword());
                cs.execute();

                cs.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally {
                if (cs != null) {
                    try {
                        cs.close();
                    } catch (SQLException e) {
                    }
                }
            }
    }



    @Override
    public void update(Client client) {

    }

    @Override
    public void delete(Client client) {

    }

    @Override
    public Client findById(Long id) {
        return null;
    }

    @Override
    public List<Client> findAll() {

        List<Client> clients = new ArrayList<>();

        CallableStatement cs = null;
        ResultSet rs = null;

        try {
            cs = connection.prepareCall("{call findAllClients()}");
            rs = cs.executeQuery();
            while (rs.next()) {
                Client client = new Client();
                client.setId(rs.getLong(1));
                client.setUsername(rs.getString(2));
                client.setPassword(rs.getString(3));
                clients.add(client);
            }

            cs.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (cs != null) {
                try {
                    cs.close();
                } catch (SQLException e) {}
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {}

            }
        }

        return clients;
    }
}
