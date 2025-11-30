package br.com.ifba;

// Importações necessárias para o Spring funcionar e para acharmos sua tela
import br.com.ifba.curso.view.CursoListar_1;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication 
// Essa anotação é o comando supremo. Ela diz ao Java: 
// "Isso é um projeto Spring Boot. Varra todas as pastas, 
// ache os @Controller, @Service, @Repository e configure tudo sozinho."
public class Prg03Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext context
                = new SpringApplicationBuilder(Prg03Application.class)
                        .headless(false)
                        .run(args);      // <--- Aqui o Spring liga, conecta no banco e cria todos os objetos.

        CursoListar_1 telaPrincipal = context.getBean(CursoListar_1.class);

        // Agora que temos a tela gerenciada pelo Spring, podemos mostrá-la.
        telaPrincipal.setVisible(true);
    }
}
