package dobackaofront.estrutura.repositories;

import dobackaofront.estrutura.models.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
