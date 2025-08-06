package org.uvsl.dto;

import org.uvsl.persistence.entity.BoardColumnKindEnum;

public record BoardColumnDTO(Long id,
                             String name,
                             BoardColumnKindEnum kind,
                             int cardsAmount) {}
