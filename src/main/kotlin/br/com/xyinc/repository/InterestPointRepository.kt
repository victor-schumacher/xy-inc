package br.com.xyinc.repository

import br.com.xyinc.model.InterestPoint
import org.springframework.data.repository.CrudRepository

interface InterestPointRepository : CrudRepository < InterestPoint , Long > {
}