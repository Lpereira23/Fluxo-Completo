@Entity
public class ExameLaboratorio {

 @Id
 @GeneratedValue
 Long id;

 String descricao;

 String atividadeFisica;

 String atividadeMental;

 String posologia;

}