package no.hal.confluence.pydev.ui.resources;

import no.hal.confluence.ui.resources.util.XmlContentRegionExtractor;

import org.w3c.dom.Node;

public class DocOnceCodeBlockSourceExtractor extends XmlContentRegionExtractor<String> {

	public DocOnceCodeBlockSourceExtractor() {
		super(null);
	}

	@Override
	protected String createSourceRegion(Node node) {
		return node.getTextContent();
	}

	@Override
	protected int skipRegionPrefixes(String browserContent, int pos) {
		int skipUpto = skipUpto(browserContent, pos, 1, "<!-- code=python", "<pre");
//		Activator.logInfo("Skipped to " + skipUpto + " past '<!-- code=python' followed by '<pre' in " + browserContent);
		return skipUpto;
	}

	@Override
	protected int skipRegion(String browserContent, int pos) {
		pos = browserContent.indexOf("</pre>", pos);
		return (pos > 0 ? pos + 6 : -1);
	}

	@Override
	protected int skipRegionSuffixes(String browserContent, int end) {
		return end;
	}

//	public static void main(String[] args) {
//		try {
//			XmlContentRegionExtractor<String> regionExtractor = new DocOnceCodeExtractor("/");
//			FileReader fileReader = new FileReader("/Users/hal/java/git/jexercise/no.hal.confluence.ui/src/no/hal/confluence/ui/actions/util/døme.html");
//			Scanner scanner = new Scanner(fileReader);
//			StringBuilder buffer = new StringBuilder();
//			while (scanner.hasNextLine()) {
//				buffer.append(scanner.nextLine());
//				buffer.append("\n");
//			}
//			Collection<?> regions = regionExtractor.getContentRegions(buffer.toString());
//			System.out.println(regions);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//	}

/*
	<!--
	Automatically generated HTML file from DocOnce source
	(https://github.com/hplgit/doconce/)
	-->
	<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="generator" content="DocOnce: https://github.com/hplgit/doconce/" />
	<meta name="description" content="An example of an example">

	<title>An example of an example</title>

	<!-- Bootstrap style: bootstrap_bluegray -->
	<link href="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" rel="stylesheet">
	<link href="https://raw.github.com/hplgit/doconce/master/bundled/html_styles/style_bootstrap/css/bootstrap_bluegray.css" rel="stylesheet">
	<!-- not necessary
	<link href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">
	-->

	</head>

	<!-- tocinfo
	{'highest level': 1, 'sections': [(" Newton's Equation ", 1, None, '___sec0')]}
	end of tocinfo -->

	<body>



	<script type="text/x-mathjax-config">
	MathJax.Hub.Config({
	  TeX: {
	     equationNumbers: {  autoNumber: "AMS"  },
	     extensions: ["AMSmath.js", "AMSsymbols.js", "autobold.js", "color.js"]
	  }
	});
	</script>
	<script type="text/javascript"
	 src="http://cdn.mathjax.org/mathjax/latest/MathJax.js?config=TeX-AMS-MML_HTMLorMML">
	</script>



	    
	<!-- Bootstrap navigation bar -->
	<div class="navbar navbar-default navbar-fixed-top">
	  <div class="navbar-header">
	    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-responsive-collapse">
	      <span class="icon-bar"></span>
	      <span class="icon-bar"></span>
	      <span class="icon-bar"></span>
	    </button>
	    <a class="navbar-brand" href="eksempel.html">An example of an example</a>
	  </div>
	  <div class="navbar-collapse collapse navbar-responsive-collapse">
	    <ul class="nav navbar-nav navbar-right">
	      <li class="dropdown">
	        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Contents <b class="caret"></b></a>
	        <ul class="dropdown-menu">
	     <!-- navigation toc: --> <li><a href="#___sec0" style="font-size: 80%;">Newton's Equation</a></li>

	        </ul>
	      </li>
	    </ul>
	  </div>
	</div>
	</div> <!-- end of navigation bar -->

	<div class="container">

	<p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p> <!-- add vertical space -->

	<!-- ------------------- main content ---------------------- -->



	<div class="jumbotron">
	<center><h1>An example of an example</h1></center>  <!-- document title -->

	<p>
	<!-- author(s): Johan Kolst&#248; S&#248;nstab&#248; -->

	<center>
	<b>Johan Kolst&#248; S&#248;nstab&#248;</b> 
	</center>


	<p>
	<!-- institution(s) -->
	<p>
	<center><h4>Sep 8, 2014</h4></center> <!-- date -->
	<p>
	<!-- This is an example script generating a simple representative example of typical examples in TKT4140 Numerical Methods with Computer Laboratory. -->

	<p>


	</div> <!-- end jumbotron -->

	<h1 id="___sec0">Newton's Equation <a name="___sec0"></a></h1>

	Let's use <a href="http://en.wikipedia.org/wiki/Heun's_method" target="_self">Heun's method</a> to solve Newton's equation:

	$$
	\begin{align}
	y^\prime(x)&=1-3x+y+x^2+xy & y(0)&=0
	\label{eq:newton}
	\end{align}
	$$


	<p>
	with analytical solution:

	$$
	\DeclareMathOperator\erf{erf}
	\begin{align*}
	y(x)=3\sqrt{2\pi e} \exp\left(x\left(1+{x\over2}\right)\right)\left[\erf\left({\sqrt{2}\over2}\left(1+x\right)\right)-\erf\left({\sqrt{2}\over2}\right)\right] + 4 \left[1-\exp\left(x\left(1+{x\over2}\right)\right)\right]-x
	\end{align*}
	$$


	<p>
	Here we have \( f(x,y)=1-3x+y+x^2+xy = 1+x(x-3)+(1+x)y \). 

	<p>
	The following program solves equation \eqref{eq:newton} with Heun's method with \( x\in\left[0,2\right] \) and \( \Delta x=0.1 \):

	<p>

	<!-- code=python (!bc pypro) typeset with pygments style "default" -->
	<div class="highlight" style="background: #f8f8f8"><pre style="line-height: 125%"><span style="color: #408080; font-style: italic"># Program Newton</span>
	<span style="color: #408080; font-style: italic"># Computes the solution of Newton&#39;s 1st order equation (1671):</span>
	<span style="color: #408080; font-style: italic"># dy/dx = 1-3*x + y + x^2 +x*y , y(0) = 0</span>
	<span style="color: #408080; font-style: italic"># using Heun&#39;s method.</span>

	<span style="color: #008000; font-weight: bold">import</span> <span style="color: #0000FF; font-weight: bold">numpy</span> <span style="color: #008000; font-weight: bold">as</span> <span style="color: #0000FF; font-weight: bold">np</span>

	xend <span style="color: #666666">=</span> <span style="color: #666666">2</span>
	dx <span style="color: #666666">=</span> <span style="color: #666666">0.1</span>
	steps <span style="color: #666666">=</span> np<span style="color: #666666">.</span>int(np<span style="color: #666666">.</span>round(xend<span style="color: #666666">/</span>dx, <span style="color: #666666">0</span>)) <span style="color: #666666">+</span> <span style="color: #666666">1</span> 
	y, x <span style="color: #666666">=</span> np<span style="color: #666666">.</span>zeros((steps,<span style="color: #666666">1</span>), <span style="color: #008000">float</span>), np<span style="color: #666666">.</span>zeros((steps,<span style="color: #666666">1</span>), <span style="color: #008000">float</span>)
	y[<span style="color: #666666">0</span>], x[<span style="color: #666666">0</span>] <span style="color: #666666">=</span> <span style="color: #666666">0.0</span>, <span style="color: #666666">0.0</span>

	<span style="color: #008000; font-weight: bold">for</span> n <span style="color: #AA22FF; font-weight: bold">in</span> <span style="color: #008000">range</span>(<span style="color: #666666">0</span>,steps<span style="color: #666666">-1</span>):
	    x[n<span style="color: #666666">+1</span>] <span style="color: #666666">=</span> (n<span style="color: #666666">+1</span>)<span style="color: #666666">*</span>dx
	    xn <span style="color: #666666">=</span> x[n]
	    fn <span style="color: #666666">=</span> <span style="color: #666666">1</span> <span style="color: #666666">+</span> xn<span style="color: #666666">*</span>(xn<span style="color: #666666">-3</span>) <span style="color: #666666">+</span> y[n]<span style="color: #666666">*</span>(<span style="color: #666666">1+</span>xn)
	    yp <span style="color: #666666">=</span> y[n] <span style="color: #666666">+</span> dx<span style="color: #666666">*</span>fn    
	    xnp1 <span style="color: #666666">=</span> x[n<span style="color: #666666">+1</span>]
	    fnp1 <span style="color: #666666">=</span> <span style="color: #666666">1</span> <span style="color: #666666">+</span> xnp1<span style="color: #666666">*</span>(xnp1<span style="color: #666666">-3</span>) <span style="color: #666666">+</span> yp<span style="color: #666666">*</span>(<span style="color: #666666">1+</span>xnp1)
	    y[n<span style="color: #666666">+1</span>] <span style="color: #666666">=</span> y[n] <span style="color: #666666">+</span> <span style="color: #666666">0.5*</span>dx<span style="color: #666666">*</span>(fn<span style="color: #666666">+</span>fnp1)

	<span style="color: #408080; font-style: italic"># Analytical solution</span>
	<span style="color: #008000; font-weight: bold">from</span> <span style="color: #0000FF; font-weight: bold">scipy.special</span> <span style="color: #008000; font-weight: bold">import</span> erf
	a <span style="color: #666666">=</span> np<span style="color: #666666">.</span>sqrt(<span style="color: #666666">2</span>)<span style="color: #666666">/2</span>
	t1 <span style="color: #666666">=</span> np<span style="color: #666666">.</span>exp(x<span style="color: #666666">*</span>(<span style="color: #666666">1+</span> x<span style="color: #666666">/2</span>))
	t2 <span style="color: #666666">=</span> erf((<span style="color: #666666">1+</span>x)<span style="color: #666666">*</span>a)<span style="color: #666666">-</span>erf(a)
	ya <span style="color: #666666">=</span> <span style="color: #666666">3*</span>np<span style="color: #666666">.</span>sqrt(<span style="color: #666666">2*</span>np<span style="color: #666666">.</span>pi<span style="color: #666666">*</span>np<span style="color: #666666">.</span>exp(<span style="color: #666666">1</span>))<span style="color: #666666">*</span>t1<span style="color: #666666">*</span>t2 <span style="color: #666666">+</span> <span style="color: #666666">4*</span>(<span style="color: #666666">1-</span>t1)<span style="color: #666666">-</span>x

	<span style="color: #408080; font-style: italic"># plotting</span>
	<span style="color: #008000; font-weight: bold">import</span> <span style="color: #0000FF; font-weight: bold">matplotlib.pylab</span> <span style="color: #008000; font-weight: bold">as</span> <span style="color: #0000FF; font-weight: bold">py</span>
	py<span style="color: #666666">.</span>plot(x, y, <span style="color: #BA2121">&#39;-b.&#39;</span>, x, ya, <span style="color: #BA2121">&#39;-g.&#39;</span>)
	py<span style="color: #666666">.</span>xlabel(<span style="color: #BA2121">&#39;x&#39;</span>)
	py<span style="color: #666666">.</span>ylabel(<span style="color: #BA2121">&#39;y&#39;</span>)
	py<span style="color: #666666">.</span>title(<span style="color: #BA2121">&#39;Solution to Newton</span><span style="color: #BB6622; font-weight: bold">\&#39;</span><span style="color: #BA2121">s equation&#39;</span>)
	py<span style="color: #666666">.</span>legend([<span style="color: #BA2121">&#39;Heun&#39;</span>, <span style="color: #BA2121">&#39;Analytical&#39;</span>], loc<span style="color: #666666">=</span><span style="color: #BA2121">&#39;lower left&#39;</span>)
	py<span style="color: #666666">.</span>grid()
	py<span style="color: #666666">.</span>savefig(<span style="color: #BA2121">&#39;plot.png&#39;</span>)
	py<span style="color: #666666">.</span>show()
	</pre></div>
	<p>
	Figure <a href="#fig:plot">1</a> shows the plot resulting from the program above. 

	<p>
	<center> <!-- figure -->
	<hr class="figure">
	<center><p class="caption">Figure 1:  Numerical and analytical solution of equation \eqref{eq:newton} computed by the program above. <a name="fig:plot"></a> </p></center>
	<p><img src="plot.png" align="bottom" height=400 width=533></p>
	</center>

	<!-- ------------------- end of main content --------------- -->

	</div>  <!-- end container -->
	<!-- include javascript, jQuery *first* -->
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
	<script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>

	<!-- Bootstrap footer
	<footer>
	<a href="http://..."><img width="250" align=right src="http://..."></a>
	</footer>
	-->


	</body>
	</html>	    
*/
}
