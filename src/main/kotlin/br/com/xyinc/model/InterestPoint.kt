package br.com.xyinc.model

import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class InterestPoint (

        @Id
        val id: String = UUID.randomUUID().toString(),
        val name: String = "",
        val x: Int = 0,
        val y: Int = 0
        )
