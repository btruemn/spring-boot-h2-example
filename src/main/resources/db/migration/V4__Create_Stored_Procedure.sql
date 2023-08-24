CREATE ALIAS QUERY AS $$
ResultSet query(Connection conn, String sql) throws SQLException {
    return conn.createStatement().executeQuery(sql);
} $$;
CALL QUERY('SELECT * FROM APP_USER');
