class Badge {
    public String print(Integer id, String name, String department) {
        String idText = id != null ? String.format("[%d] - ",id) : ""; 
        String deparmentText =  department != null ? String.format("%s", department.toUpperCase()) : "OWNER"; 
        return String.format("%s%s - %s", idText, name, deparmentText);
    }
}
