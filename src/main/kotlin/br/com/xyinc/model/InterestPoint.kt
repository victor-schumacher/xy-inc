package br.com.xyinc.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class InterestPoint (
        @Id
        val id: String
)