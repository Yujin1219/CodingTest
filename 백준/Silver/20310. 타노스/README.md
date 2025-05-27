# [Silver III] 타노스 - 20310 

[문제 링크](https://www.acmicpc.net/problem/20310) 

### 성능 요약

메모리: 14232 KB, 시간: 108 ms

### 분류

그리디 알고리즘, 문자열

### 제출 일자

2025년 5월 27일 10:35:35

### 문제 설명

<p>어느 날, 타노스는 0과 1로 이루어진 문자열 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D446 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>S</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$S$</span></mjx-container>를 보았다. 신기하게도, <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D446 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>S</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$S$</span></mjx-container>가 포함하는 0의 개수와 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D446 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>S</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$S$</span></mjx-container>가 포함하는 1의 개수는 모두 짝수라고 한다.</p>

<p>갑자기 심술이 난 타노스는 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D446 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>S</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$S$</span></mjx-container>를 구성하는 문자 중 절반의 0과 절반의 1을 제거하여 새로운 문자열 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-msup><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D446 TEX-I"></mjx-c></mjx-mi><mjx-script style="vertical-align: 0.363em; margin-left: 0.052em;"><mjx-mo class="mjx-var" size="s"><mjx-c class="mjx-c2032"></mjx-c></mjx-mo></mjx-script></mjx-msup></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><msup><mi>S</mi><mo data-mjx-alternate="1">′</mo></msup></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$S'$</span></mjx-container>를 만들고자 한다. <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-msup><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D446 TEX-I"></mjx-c></mjx-mi><mjx-script style="vertical-align: 0.363em; margin-left: 0.052em;"><mjx-mo class="mjx-var" size="s"><mjx-c class="mjx-c2032"></mjx-c></mjx-mo></mjx-script></mjx-msup></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><msup><mi>S</mi><mo data-mjx-alternate="1">′</mo></msup></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$S'$</span></mjx-container>로 가능한 문자열 중 사전순으로 가장 빠른 것을 구하시오.</p>

### 입력 

 <p>문자열 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D446 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>S</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$S$</span></mjx-container>가 주어진다.</p>

### 출력 

 <p><mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"> <mjx-math class="MJX-TEX" aria-hidden="true"><mjx-msup><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D446 TEX-I"></mjx-c></mjx-mi><mjx-script style="vertical-align: 0.363em; margin-left: 0.052em;"><mjx-mo class="mjx-var" size="s"><mjx-c class="mjx-c2032"></mjx-c></mjx-mo></mjx-script></mjx-msup></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><msup><mi>S</mi><mo data-mjx-alternate="1">′</mo></msup></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$S'$</span></mjx-container>로 가능한 문자열 중 사전순으로 가장 빠른 것을 출력한다.</p>

# 문제풀이
### 문제 이해

- 주어진 문자열 `S`는 0과 1로만 이루어짐
- 0과 1의 개수는 모두 짝수
- 각 숫자의 절반만 제거하여 새 문자열 `S`를 만듦
- 가능한 `S'` 중 **사전순**으로 가장 빠른 문자열을 출력
    
    → 사전순이란, 더 작을 수록 ( 앞의 수가 0일 수록 ) 앞서게 됨
    

### 문제 풀이 방법

1. 문자열에서 0의 개수와 1의 개수를 각각 구한다
2. 제거할 개수는 각각 절반이다
3. 앞에서부터 탐색하면서 남은 개수 내에서 0을 우선 선택하고, 그다음 1을 선택하면서 사전순으로 가장 앞에 있는걸 찾는다
4. 문자열에서 0의 개수와 1의 개수를 각각 구한다
5. 제거할 개수는 각각 절반이다
    - `1`은 절반 개수를 제거하고, `0`은 절반 개수만 남긴다
6. 앞에서부터 탐색하면서 1을 먼저 제가한다
    - 입력 문자열을 앞에서부터
        - `1`을 만났을 때 `removeOne`이 남아 있으면 제거하고, 아니면 `temp`에 추가
        - 0은 건들이지 않는다
7. 그다음 앞에서부터 0을 찾아 절반만 남긴다
    - 만든 `temp` 문자열을 다시 앞에서부터
        - `0`은 `keepZero`개까지만 `result`에 추가하고
        - 나머지 `0`은 무시하여 추가하지않고, `1`은 그대로 남긴다

### 코드 설명
```java
int totalZero = 0, totalOne = 0;
for (char c : input.toCharArray()) {
    if (c == '0') totalZero++;
    else totalOne++;
}
```

- 0의 개수와 1의 개수를 을 각각 세고, 이 값을 절반을 제거할 때 사용

```java
int removeOne = totalOne / 2;
int removeZero = totalZero / 2;
```

- 문제 조건에 따라 0과 1을 절반씩 제거해야 하므로 2로 나눠 구함

> **사전순으로 빠른 문자열을 만들려면?**
> 
> 
> 가능한 앞쪽에 0을 남기고, 뒤쪽에 1을 남겨야 사전순으로 작음
> 
> → 1은 앞에서 부터 제고, 0은 앞에서부터 keepZero개만 남기고 나머지 제거
> 

```java
StringBuilder temp = new StringBuilder();
for (char c : input.toCharArray()) {
    if (c == '1' && removeOne > 0) {
        removeOne--; // 제거 대상이면 추가하지 않음
    } else {
        temp.append(c); // 남길 문자만 보관
    }
}
```

- `1`은 앞에서부터 차례로 제거
- 제거 수가 다 차면 이후의 `1`은 남김

```java
StringBuilder result = new StringBuilder();
int zeroCount = 0;

for (int i = 0; i < temp.length(); i++) {
    char c = temp.charAt(i);
    if (c == '0') {
        if (zeroCount < keepZero) {
            result.append('0');
            zeroCount++;
        }
        // 뒤쪽 0은 제거됨
    } else {
        result.append('1');
    }
}
```

- `0`을 `keepZero`개까지만 남기고 이후는 건너뜀
- `1`은 모두 그대로 추가함
