package br.com.xyinc.model

import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class InterestPoint (
        val name: String = "",
        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        @JsonProperty(value = "id", access = JsonProperty.Access.READ_ONLY)
        val id: Long = 0L,
        val x: Int = 0,
        val y: Int = 0
        )