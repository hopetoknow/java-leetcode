# [1844. Replace All Digits with Characters](https://leetcode.com/problems/replace-all-digits-with-characters)

## Description

<p>You are given a <strong>0-indexed</strong> string <code>s</code> that has lowercase English letters in its <strong>even</strong> indices and digits in its <strong>odd</strong> indices.</p>

<p>You must perform an operation <code>shift(c, x)</code>, where <code>c</code> is a character and <code>x</code> is a digit, that returns the <code>x<sup>th</sup></code> character after <code>c</code>.</p>

<ul>
	<li>For example, <code>shift('a', 5) = 'f'</code> and <code>shift('x', 0) = 'x'</code>.</li>
</ul>

<p>For every <strong>odd</strong> index <code>i</code>, you want to replace the digit <code>s[i]</code> with the result of the <code>shift(s[i-1], s[i])</code> operation.</p>

<p>Return <code>s</code><em> </em>after replacing all digits. It is <strong>guaranteed</strong> that<em> </em><code>shift(s[i-1], s[i])</code><em> </em>will never exceed<em> </em><code>'z'</code>.</p>

<p><strong>Note</strong> that <code>shift(c, x)</code> is <strong>not</strong> a preloaded function, but an operation <em>to be implemented</em> as part of the solution.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> s = "a1c1e1"
<strong>Output:</strong> "abcdef"
<strong>Explanation: </strong>The digits are replaced as follows:
- s[1] -&gt; shift('a',1) = 'b'
- s[3] -&gt; shift('c',1) = 'd'
- s[5] -&gt; shift('e',1) = 'f'</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> s = "a1b2c3d4e"
<strong>Output:</strong> "abbdcfdhe"
<strong>Explanation: </strong>The digits are replaced as follows:
- s[1] -&gt; shift('a',1) = 'b'
- s[3] -&gt; shift('b',2) = 'd'
- s[5] -&gt; shift('c',3) = 'f'
- s[7] -&gt; shift('d',4) = 'h'</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 100</code></li>
	<li><code>s</code> consists only of lowercase English letters and digits.</li>
	<li><code>shift(s[i-1], s[i]) &lt;= 'z'</code> for all <strong>odd</strong> indices <code>i</code>.</li>
</ul>
