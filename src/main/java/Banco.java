import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Banco {
    private static List<Empresa> lista = new ArrayList<>();
    private static Integer chaveSequencial = 1;
    static {
        Empresa empresa = new Empresa();
        empresa.setNome("Nubanck");
        empresa.setId(chaveSequencial ++);

        Empresa empresa1 = new Empresa();
        empresa1.setNome("Inter");
        empresa1.setId(chaveSequencial ++);

        lista.add(empresa);
        lista.add(empresa1);
    }

    public void adiciona(Empresa empresa){
        empresa.setId(chaveSequencial ++);
        Banco.lista.add(empresa);
    }

    public List<Empresa> getEmpresas(){
        return Banco.lista;
    }
}
