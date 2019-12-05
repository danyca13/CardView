package dany.caro.cardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lugares=ArrayList<Lugar>()
        lugares.add(Lugar("Puerto Vallarta", "https://www.garzablancaresort.com.mx/blog/wp-content/uploads/2015/12/the-best-beaches-in-puerto-vallarta-e1506119214708.jpg", "Puerto Vallarta es un lugar hermoso, para ir a vacacionar con la familia..."))
        lugares.add(Lugar("Guanajuato", "https://www.am.com.mx/__export/1563220920642/sites/am/img/2019/07/15/guanajuato-capital-hospedaje-impuesto.jpg_851672003.jpg", "Guanajuato un lugar hermoso para disfrutar y pedir matrimonio a tu chica."))
        lugares.add(Lugar("Guadalajar", "https://uberblogapi.10upcdn.com/wp-content/uploads/2019/06/6-lugares-para-visitar-en-Guadalajara-que-no-perdonar%C3%A1s-perderte.png","Guadalajar la hermosa perla tapatia, lugar del mariachi y del tequila"))
        lugares.add(Lugar("Michoacan", "https://www.eleconomista.com.mx/__export/1575427877754/sites/eleconomista/img/2019/09/19/shutterstock_1346592710.jpg_596760611.jpg","Michoacan un hermoso estado para conocer y disfrutar de sus culturas"))

        miRecycler.adapter=LugarAdapter(lugares,this)
        //miRecycler.layoutManager= LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        miRecycler.layoutManager=StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)



    }
}

