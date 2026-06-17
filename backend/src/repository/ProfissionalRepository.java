@Repository

public interface ProfissionalRepository
extends JpaRepository<
ProfissionalSaude,
Long> {

}

AtendimentoRepository.java

@Repository

public interface AtendimentoRepository
extends JpaRepository<
Atendimento,
Long> {

}

ExameRepository.java

@Repository

public interface ExameRepository
extends JpaRepository<
ExameLaboratorio,
Long> {

}