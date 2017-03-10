package vectorpipe.geom

import geotrellis.vector._
import scaliper._

// --- //

class ClipBench extends Benchmarks with ConsoleReport {
  /*
  benchmark("Basic Operations") {
    run("Line.points - 2 points") {
      new Benchmark {
        var line: Line = _

        override def setUp() = {
          line = Line((0,0), (1,1))
        }

        def run() = line.points
      }
    }

    run("Line.points - 20 points") {
      new Benchmark {
        var line: Line = _

        override def setUp() = {
          line = Line((1 to 20).map(n => Point(n,n)))
        }

        def run() = line.points
      }
    }

    run("Line.points - 200 points") {
      new Benchmark {
        var line: Line = _

        override def setUp() = {
          line = Line((1 to 200).map(n => Point(n,n)))
        }

        def run() = line.points
      }
    }
  }
   */

  benchmark("toNearestPoint - ALL IN - two-point line") {
    /*
    run("Tail Recursion") {
      new Benchmark {
        var extent: Extent = _
        var line: Line = _

        override def setUp() = {
          extent = Extent(0, 0, 5, 5)
          line = Line((1,1), (2,2))
        }

        def run() = Clip.toNearestPointR(extent, line)
      }
    }

    run("foldLeftM") {
      new Benchmark {
        var extent: Extent = _
        var line: Line = _

        override def setUp() = {
          extent = Extent(0, 0, 5, 5)
          line = Line((1,1), (2,2))
        }

        def run() = Clip.toNearestPointF(extent, line)
      }
    }
    */

    run("Java Style") {
      new Benchmark {
        var extent: Extent = _
        var line: Line = _

        override def setUp() = {
          extent = Extent(0, 0, 5, 5)
          line = Line((1,1), (2,2))
        }

        def run() = Clip.toNearestPointJ(extent, line)
      }
    }

    run("Java Style - Robust") {
      new Benchmark {
        var extent: Extent = _
        var line: Line = _

        override def setUp() = {
          extent = Extent(0, 0, 5, 5)
          line = Line((1,1), (2,2))
        }

        def run() = Clip.toNearestPointJRobust(extent, line)
      }
    }

    run("Java Style - Robuster") {
      new Benchmark {
        var extent: Extent = _
        var line: Line = _

        override def setUp() = {
          extent = Extent(0, 0, 5, 5)
          line = Line((1,1), (2,2))
        }

        def run() = Clip.toNearestPointJRobuster(extent, line)
      }
    }
  }

  benchmark("toNearestPoint - ALL IN - short line") {
    /*
    run("Tail Recursion") {
      new Benchmark {
        var extent: Extent = _
        var line: Line = _

        override def setUp() = {
          extent = Extent(-1000, -1000, 1000, 1000)
          line = Line((-10 to 10).map(n => Point(n,n)))
        }

        def run() = Clip.toNearestPointR(extent, line)
      }
    }

    run("foldLeftM") {
      new Benchmark {
        var extent: Extent = _
        var line: Line = _

        override def setUp() = {
          extent = Extent(-1000, -1000, 1000, 1000)
          line = Line((-10 to 10).map(n => Point(n,n)))
        }

        def run() = Clip.toNearestPointF(extent, line)
      }
    }
    */

    run("Java Style") {
      new Benchmark {
        var extent: Extent = _
        var line: Line = _

        override def setUp() = {
          extent = Extent(-1000, -1000, 1000, 1000)
          line = Line((-10 to 10).map(n => Point(n,n)))
        }

        def run() = Clip.toNearestPointJ(extent, line)
      }
    }

    run("Java Style - Robust") {
      new Benchmark {
        var extent: Extent = _
        var line: Line = _

        override def setUp() = {
          extent = Extent(-1000, -1000, 1000, 1000)
          line = Line((-10 to 10).map(n => Point(n,n)))
        }

        def run() = Clip.toNearestPointJRobust(extent, line)
      }
    }

    run("Java Style - Robuster") {
      new Benchmark {
        var extent: Extent = _
        var line: Line = _

        override def setUp() = {
          extent = Extent(-1000, -1000, 1000, 1000)
          line = Line((-10 to 10).map(n => Point(n,n)))
        }

        def run() = Clip.toNearestPointJRobuster(extent, line)
      }
    }
  }

  benchmark("toNearestPoint - ALL IN - medium line") {
    /*
    run("Tail Recursion") {
      new Benchmark {
        var extent: Extent = _
        var line: Line = _

        override def setUp() = {
          extent = Extent(-1000, -1000, 1000, 1000)
          line = Line((-100 to 100).map(n => Point(n,n)))
        }

        def run() = Clip.toNearestPointR(extent, line)
      }
    }

    run("foldLeftM") {
      new Benchmark {
        var extent: Extent = _
        var line: Line = _

        override def setUp() = {
          extent = Extent(-1000, -1000, 1000, 1000)
          line = Line((-100 to 100).map(n => Point(n,n)))
        }

        def run() = Clip.toNearestPointF(extent, line)
      }
    }
    */

    run("Java Style") {
      new Benchmark {
        var extent: Extent = _
        var line: Line = _

        override def setUp() = {
          extent = Extent(-1000, -1000, 1000, 1000)
          line = Line((-100 to 100).map(n => Point(n,n)))
        }

        def run() = Clip.toNearestPointJ(extent, line)
      }
    }

    run("Java Style - Robust") {
      new Benchmark {
        var extent: Extent = _
        var line: Line = _

        override def setUp() = {
          extent = Extent(-1000, -1000, 1000, 1000)
          line = Line((-100 to 100).map(n => Point(n,n)))
        }

        def run() = Clip.toNearestPointJRobust(extent, line)
      }
    }

    run("Java Style - Robuster") {
      new Benchmark {
        var extent: Extent = _
        var line: Line = _

        override def setUp() = {
          extent = Extent(-1000, -1000, 1000, 1000)
          line = Line((-100 to 100).map(n => Point(n,n)))
        }

        def run() = Clip.toNearestPointJRobuster(extent, line)
      }
    }
  }

  benchmark("toNearestPoint - MOST OUT - short line") {
    /*
    run("Tail Recursion") {
      new Benchmark {
        var extent: Extent = _
        var line: Line = _

        override def setUp() = {
          extent = Extent(0, 0, 5, 5)
          line = Line((-10 to 10).map(n => Point(n,n)))
        }

        def run() = Clip.toNearestPointR(extent, line)
      }
    }

    run("foldLeftM") {
      new Benchmark {
        var extent: Extent = _
        var line: Line = _

        override def setUp() = {
          extent = Extent(0, 0, 5, 5)
          line = Line((-10 to 10).map(n => Point(n,n)))
        }

        def run() = Clip.toNearestPointF(extent, line)
      }
    }
    */

    run("Java Style") {
      new Benchmark {
        var extent: Extent = _
        var line: Line = _

        override def setUp() = {
          extent = Extent(0, 0, 5, 5)
          line = Line((-10 to 10).map(n => Point(n,n)))
        }

        def run() = Clip.toNearestPointJ(extent, line)
      }
    }

    run("Java Style - Robust") {
      new Benchmark {
        var extent: Extent = _
        var line: Line = _

        override def setUp() = {
          extent = Extent(0, 0, 5, 5)
          line = Line((-10 to 10).map(n => Point(n,n)))
        }

        def run() = Clip.toNearestPointJRobust(extent, line)
      }
    }

    run("Java Style - Robuster") {
      new Benchmark {
        var extent: Extent = _
        var line: Line = _

        override def setUp() = {
          extent = Extent(0, 0, 5, 5)
          line = Line((-10 to 10).map(n => Point(n,n)))
        }

        def run() = Clip.toNearestPointJRobuster(extent, line)
      }
    }
  }

  benchmark("toNearestPoint - MOST OUT - medium line") {
    /*
    run("Tail Recursion") {
      new Benchmark {
        var extent: Extent = _
        var line: Line = _

        override def setUp() = {
          extent = Extent(0, 0, 5, 5)
          line = Line((-100 to 100).map(n => Point(n,n)))
        }

        def run() = Clip.toNearestPointR(extent, line)
      }
    }

    run("foldLeftM") {
      new Benchmark {
        var extent: Extent = _
        var line: Line = _

        override def setUp() = {
          extent = Extent(0, 0, 5, 5)
          line = Line((-100 to 100).map(n => Point(n,n)))
        }

        def run() = Clip.toNearestPointF(extent, line)
      }
    }
     */

    run("Java Style") {
      new Benchmark {
        var extent: Extent = _
        var line: Line = _

        override def setUp() = {
          extent = Extent(0, 0, 5, 5)
          line = Line((-100 to 100).map(n => Point(n,n)))
        }

        def run() = Clip.toNearestPointJ(extent, line)
      }
    }

    run("Java Style - Robust") {
      new Benchmark {
        var extent: Extent = _
        var line: Line = _

        override def setUp() = {
          extent = Extent(0, 0, 5, 5)
          line = Line((-100 to 100).map(n => Point(n,n)))
        }

        def run() = Clip.toNearestPointJRobust(extent, line)
      }
    }

    run("Java Style - Robuster") {
      new Benchmark {
        var extent: Extent = _
        var line: Line = _

        override def setUp() = {
          extent = Extent(0, 0, 5, 5)
          line = Line((-100 to 100).map(n => Point(n,n)))
        }

        def run() = Clip.toNearestPointJRobuster(extent, line)
      }
    }
  }
}
