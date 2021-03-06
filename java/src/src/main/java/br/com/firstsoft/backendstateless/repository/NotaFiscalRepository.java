package br.com.firstsoft.backendstateless.repository;

import br.com.firstsoft.backendstateless.business.vo.NotaFiscal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotaFiscalRepository extends JpaRepository<NotaFiscal, String> {

}
