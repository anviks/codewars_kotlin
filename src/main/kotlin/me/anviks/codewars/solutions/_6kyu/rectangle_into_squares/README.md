<p>The drawing below gives an idea of how to cut a given "true" rectangle into squares ("true" rectangle meaning that the two dimensions are different).</p>
<p><img alt="alternative text" src="https://i.imgur.com/lk5vJ7sm.jpg"></p>
<p>Can you translate this drawing into an algorithm?</p>
<p>You will be given two dimensions </p>
<ol>
<li>a positive integer length</li>
<li>a positive integer width</li>
</ol>
<p>You will return a collection or a string (depending on the language; Shell bash, PowerShell, Pascal and Fortran return a string) with the size of each of the  squares.</p>
<h4 id="examples-in-general-form">Examples in general form:</h4>
<p>(depending on the language)</p>
<pre><code>  sqInRect(5, 3) should return [3, 2, 1, 1]
  sqInRect(3, 5) should return [3, 2, 1, 1]
  
  You can see examples for your language in **"SAMPLE TESTS".**
</code></pre>
<h4 id="notes">Notes:</h4>
<ul>
<li><p><code>lng == wdth</code> as a starting case would be an entirely different problem and the drawing is planned to be interpreted with <code>lng != wdth</code>. (See kata, Square into Squares. Protect trees! <a href="http://www.codewars.com/kata/54eb33e5bc1a25440d000891" data-turbolinks="false" target="_blank">http://www.codewars.com/kata/54eb33e5bc1a25440d000891</a> for this problem). </p>
<p>When the initial parameters are so that <code>lng</code> == <code>wdth</code>, the solution <code>[lng]</code> would be the most obvious but not in the spirit of this kata   so, in that case, return <code>None</code>/<code>nil</code>/<code>null</code>/<code>Nothing</code> <strong>or</strong>
return <code>{}</code> with C++, <code>Array()</code> with Scala, <code>[]</code> with Perl, Raku.</p>
</li>
<li><p>In that case the returned structure of <strong>C</strong> will have its <code>sz</code> component equal to <code>0</code>. </p>
</li>
<li><p>Return the string <code>"nil"</code> with Bash, PowerShell, Pascal and Fortran.</p>
</li>
</ul>
