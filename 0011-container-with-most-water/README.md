# [11. Container With Most Water](https://leetcode.com/problems/container-with-most-water/)

**Difficulty:** Medium
  
**Topics:** Array, Two Pointers, Greedy

## Problem

<p>You are given an integer array <code>height</code> of length <code>n</code>. There are <code>n</code> vertical lines drawn such that the two endpoints of the <code>i<sup>th</sup></code> line are <code>(i, 0)</code> and <code>(i, height[i])</code>.</p>

<p>Find two lines that together with the x-axis form a container, such that the container contains the most water.</p>

<p>Return <em>the maximum amount of water a container can store</em>.</p>

<p><strong>Notice</strong> that you may not slant the container.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/17/question_11.jpg" style="width: 600px; height: 287px;" />
<pre>
<strong>Input:</strong> height = [1,8,6,2,5,4,8,3,7]
<strong>Output:</strong> 49
<strong>Explanation:</strong> The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> height = [1,1]
<strong>Output:</strong> 1
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>n == height.length</code></li>
	<li><code>2 &lt;= n &lt;= 10<sup>5</sup></code></li>
	<li><code>0 &lt;= height[i] &lt;= 10<sup>4</sup></code></li>
</ul>

## Submissions

| # | File | Language | Status | Runtime | Memory | Submitted |
|---|------|----------|--------|---------|--------|-----------|
| 1 | [container-with-most-water.java](container-with-most-water.java) | Java | Accepted | 5 ms (beats 82.4%) | 58 MB (beats 99.9%) | 2025-07-02 |
| 2 | [2-container-with-most-water.java](2-container-with-most-water.java) | Java | Accepted | 5 ms (beats 82.4%) | 76.7 MB (beats 98.0%) | 2025-12-16 |
| 3 | [3-container-with-most-water.java](3-container-with-most-water.java) | Java | Accepted | 5 ms (beats 82.4%) | 77.1 MB (beats 84.5%) | 2026-09-30 |

<sub>Synced by LeetSync</sub>
