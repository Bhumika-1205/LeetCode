# [122. Best Time to Buy and Sell Stock II](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/)

**Difficulty:** Medium
  
**Topics:** Array, Dynamic Programming, Greedy

## Problem

<p>You are given an integer array <code>prices</code> where <code>prices[i]</code> is the price of a given stock on the <code>i<sup>th</sup></code> day.</p>

<p>On each day, you may decide to buy and/or sell the stock. You can only hold <strong>at most one</strong> share of the stock at any time. However, you can sell and buy the stock multiple times on the <strong>same day</strong>, ensuring you never hold more than one share of the stock.</p>

<p>Find and return <em>the <strong>maximum</strong> profit you can achieve</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> prices = [7,1,5,3,6,4]
<strong>Output:</strong> 7
<strong>Explanation:</strong> Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Total profit is 4 + 3 = 7.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> prices = [1,2,3,4,5]
<strong>Output:</strong> 4
<strong>Explanation:</strong> Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
Total profit is 4.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> prices = [7,6,4,3,1]
<strong>Output:</strong> 0
<strong>Explanation:</strong> There is no way to make a positive profit, so we never buy the stock to achieve the maximum profit of 0.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= prices.length &lt;= 3 * 10<sup>4</sup></code></li>
	<li><code>0 &lt;= prices[i] &lt;= 10<sup>4</sup></code></li>
</ul>

## Submissions

| # | File | Language | Status | Runtime | Memory | Submitted |
|---|------|----------|--------|---------|--------|-----------|
| 1 | [best-time-to-buy-and-sell-stock-ii.java](best-time-to-buy-and-sell-stock-ii.java) | Java | Accepted | 1 ms (beats 18.6%) | 45.6 MB (beats 99.6%) | 2025-06-28 |
| 2 | [2-best-time-to-buy-and-sell-stock-ii.java](2-best-time-to-buy-and-sell-stock-ii.java) | Java | Accepted | 1 ms (beats 18.6%) | 45.6 MB (beats 99.6%) | 2025-06-28 |
| 3 | [3-best-time-to-buy-and-sell-stock-ii.java](3-best-time-to-buy-and-sell-stock-ii.java) | Java | Accepted | 1 ms (beats 18.6%) | 45.8 MB (beats 99.2%) | 2025-06-28 |
| 4 | [4-best-time-to-buy-and-sell-stock-ii.java](4-best-time-to-buy-and-sell-stock-ii.java) | Java | Accepted | 1 ms (beats 18.6%) | 46 MB (beats 95.8%) | 2025-06-28 |
| 5 | [5-best-time-to-buy-and-sell-stock-ii.java](5-best-time-to-buy-and-sell-stock-ii.java) | Java | Accepted | 1 ms (beats 18.6%) | 45.7 MB (beats 99.6%) | 2025-06-28 |

<sub>Synced by LeetSync</sub>
