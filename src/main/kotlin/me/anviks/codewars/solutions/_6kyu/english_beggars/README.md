<p>Born a misinterpretation of <a href="https://www.codewars.com/kata/simple-fun-number-334-two-beggars-and-gold/" data-turbolinks="false" target="_blank">this kata</a>, your task here is pretty simple: given an array of values and an amount of beggars, you are supposed to return an array with the sum of what each beggar brings home, assuming they all take regular turns, from the first to the last.</p>
<p>For example: <code>[1,2,3,4,5]</code> for <code>2</code> beggars will return a result of <code>[9,6]</code>, as the first one takes <code>[1,3,5]</code>, the second collects <code>[2,4]</code>.</p>
<p>The same array with <code>3</code> beggars would have in turn have produced a better out come for the second beggar: <code>[5,7,3]</code>, as they will respectively take <code>[1,4]</code>, <code>[2,5]</code> and <code>[3]</code>.</p>
<p>Also note that not all beggars have to take the same amount of "offers", meaning that the length of the array is not necessarily a multiple of <code>n</code>; length can be even shorter, in which case the last beggars will of course take nothing (<code>0</code>).</p>
<p><em><strong>Note:</strong></em> in case you don't get why this kata is about <em>English</em> beggars, then you are not familiar on how religiously queues are taken in the kingdom ;)</p>
<p><em><strong>Note 2:</strong></em> do not modify the input array.</p>