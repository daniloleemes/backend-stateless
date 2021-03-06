package br.com.firstsoft.backendstateless.business.vo.embeddables;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Date;

@Data
@Embeddable
public class DadosBasicosPK implements Serializable {

    @JsonProperty("DatadeEmissao")
    private Date dataEmissao;
    @JsonProperty("Modelo")
    private String modelo;
    @JsonProperty("Numero")
    private String numero;
    @JsonProperty("Serie")
    private String serie;
    @JsonProperty("ValorTotaldaNotaFiscal")
    private String valorNota;

    public DadosBasicosPK() {
    }

    public DadosBasicosPK(Date dataEmissao, String modelo, String numero, String serie, String valorNota) {
        this.dataEmissao = dataEmissao;
        this.modelo = modelo;
        this.numero = numero;
        this.serie = serie;
        this.valorNota = valorNota;
    }
}
