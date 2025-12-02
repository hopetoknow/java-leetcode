# [3760. Maximum Substrings With Distinct Start](https://leetcode.com/problems/maximum-substrings-with-distinct-start)

## Description

<p>You are given a string <code>s</code> consisting of lowercase English letters.</p>

<p>Return an integer denoting the <strong>maximum</strong> number of <span data-keyword="substring-nonempty" class=" cursor-pointer relative text-dark-blue-s text-sm"><button type="button" aria-haspopup="dialog" aria-expanded="false" aria-controls="radix-:r3f:" data-state="closed" class="">substrings</button></span> you can split <code>s</code> into such that each <strong>substring</strong> starts with a <strong>distinct</strong> character (i.e., no two substrings start with the same character).</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = "abab"</span></p>

<p><strong>Output:</strong> <span class="example-io">2</span></p>

<p><strong>Explanation:</strong></p>

<ul>
	<li>Split <code>"abab"</code> into <code>"a"</code> and <code>"bab"</code>.</li>
	<li>Each substring starts with a distinct character i.e <code>'a'</code> and <code>'b'</code>. Thus, the answer is 2.</li>
</ul>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = "abcd"</span></p>

<p><strong>Output:</strong> <span class="example-io">4</span></p>

<p><strong>Explanation:</strong></p>

<ul>
	<li>Split <code>"abcd"</code> into <code>"a"</code>, <code>"b"</code>, <code>"c"</code>, and <code>"d"</code>.</li>
	<li>Each substring starts with a distinct character. Thus, the answer is 4.</li>
</ul>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = "aaaa"</span></p>

<p><strong>Output:</strong> <span class="example-io">1</span></p>

<p><strong>Explanation:</strong></p>

<ul>
	<li>All characters in <code>"aaaa"</code> are <code>'a'</code>.</li>
	<li>Only one substring can start with <code>'a'</code>. Thus, the answer is 1.</li>
</ul>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 10<sup>5</sup></code></li>
	<li><code>s</code> consists of lowercase English letters.</li>
</ul>
