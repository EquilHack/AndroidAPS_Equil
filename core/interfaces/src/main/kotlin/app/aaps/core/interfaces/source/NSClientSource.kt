package app.aaps.core.interfaces.source

import info.nightscout.database.entities.GlucoseValue

interface NSClientSource {

    fun isEnabled(): Boolean
    fun detectSource(glucoseValue: GlucoseValue)
}