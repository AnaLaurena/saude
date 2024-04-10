public class RegistroSono {

    private int id;
    private int idUsuario;
    private String data;
    private String horaSono;

    public RegistroSono() {
    }

    public RegistroSono(int id, int idUsuario, String data, String horaSono) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.data = data;
        this.horaSono = horaSono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHoraSono() {
        return horaSono;
    }

    public void setHoraSono(String horaSono) {
        this.horaSono = horaSono;
    }

    @Override
    public String toString() {
        return "RegistroSono{" +
                "id=" + id +
                ", idUsuario=" + idUsuario +
                ", data='" + data + '\'' +
                ", horaSono='" + horaSono + '\'' +
                '}';
    }
}
