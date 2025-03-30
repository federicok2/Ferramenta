package com.example.Ferramenta.Repository;

import com.example.Ferramenta.Entity.Fatturato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FatturatoRepository extends JpaRepository<Fatturato,Long> {
}
