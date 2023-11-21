package com.example.futstats.data

import java.util.Date

data class Partido(var jugador: Jugador, var equipo: Equipo, var estadisticas:String, var fecha:Date)

/*TODO -> Sera el objeto que mostremos en nuestra lista. El atributo estadisticas seran los G y A.
*         Si el jugador es un portero, sus estadisticas cambiaran a porteria a cero (Si - No), G y A*/
