@Entity
public class Atendimento {

 @Id
 @GeneratedValue
 Long id;

 LocalDateTime dataHorario;

 String titulo;

 String linkVideoConferencia;

 Boolean video;

 String receita;

}