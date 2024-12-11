# [34. Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)

**Difficulty:** Medium
  
**Topics:** Array, Binary Search

## Problem

<p>Given an array of integers <code>nums</code> sorted in non-decreasing order, find the starting and ending position of a given <code>target</code> value.</p>

<p>If <code>target</code> is not found in the array, return <code>[-1, -1]</code>.</p>

<p>You must&nbsp;write an algorithm with&nbsp;<code>O(log n)</code> runtime complexity.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> nums = [5,7,7,8,8,10], target = 8
<strong>Output:</strong> [3,4]
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> nums = [5,7,7,8,8,10], target = 6
<strong>Output:</strong> [-1,-1]
</pre><p><strong class="example">Example 3:</strong></p>
<pre><strong>Input:</strong> nums = [], target = 0
<strong>Output:</strong> [-1,-1]
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>0 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
	<li><code>-10<sup>9</sup>&nbsp;&lt;= nums[i]&nbsp;&lt;= 10<sup>9</sup></code></li>
	<li><code>nums</code> is a non-decreasing array.</li>
	<li><code>-10<sup>9</sup>&nbsp;&lt;= target&nbsp;&lt;= 10<sup>9</sup></code></li>
</ul>

## Submissions

| # | File | Language | Status | Runtime | Memory | Submitted |
|---|------|----------|--------|---------|--------|-----------|
| 1 | [find-first-and-last-position-of-element-in-sorted-array.java](find-first-and-last-position-of-element-in-sorted-array.java) | Java | Accepted | 1 ms (beats 0.9%) | 46.1 MB (beats 100.0%) | 2024-12-11 |
| 2 | [2-find-first-and-last-position-of-element-in-sorted-array.java](2-find-first-and-last-position-of-element-in-sorted-array.java) | Java | Accepted | 0 ms (beats 100.0%) | 46.1 MB (beats 100.0%) | 2024-12-11 |

<sub>Synced by LeetSync</sub>
