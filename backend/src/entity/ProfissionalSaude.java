@Entity
public class ProfissionalSaude {

 @Id
 @GeneratedValue
 Long id;

 String nome;

 String telefone;

 String endereco;

 @Enumerated(EnumType.STRING)
 Categoria categoria;

}