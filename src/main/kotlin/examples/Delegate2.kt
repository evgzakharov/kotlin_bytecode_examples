package examples

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class DeleteExample {
    val name: String by Delegate()
}

class Delegate : ReadWriteProperty<DeleteExample, String> {
    override fun setValue(thisRef: DeleteExample, property: KProperty<*>, value: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getValue(thisRef: DeleteExample, property: KProperty<*>): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
