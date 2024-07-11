package com.mora.monitor.models;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Leecontrolenvioapi {

	private String ace_estadot;
	private LocalDate ace_fdesde;
	private LocalDate ace_fhasta;
	
}
