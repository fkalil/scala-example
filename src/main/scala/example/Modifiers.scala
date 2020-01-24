

  package com.acme.coolapp.model {
    class Foo {
      private[model] def doX {}
      private[coolapp] def doY {}
      private[acme] def doZ {}
    }
  }

  import com.acme.coolapp.model._

  package com.acme.coolapp.view {
    class Bar {
      val f = new Foo
    //  f.doX  // won't compile
      f.doY
      f.doZ
    }
  }

  package com.acme.common {
    class Bar {
      val f = new Foo
      //f.doX  // won't compile
      //f.doY  // won't compile
      f.doZ
    }
  }



