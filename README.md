#  Bitcoin Price Tracker App

A real-time Bitcoin price tracking application built with **Jetpack Compose** in **Kotlin**. It combines live API data from **CoinLayer** with historical data from **CoinGecko**, includes Lottie animations for visual feedback, and renders a dynamic line chart of price trends over the last 7 days.

---

##  Features

-  Real-time BTC price updates from **CoinLayer API**
-  7-day historical price chart fetched from **CoinGecko API**
-  Auto-refresh every 30 seconds (configurable)
-  Visual feedback using **Lottie animations** to indicate price rising or falling
-  Smooth, responsive line graph with min/max markers
-  Adaptive layout for portrait and landscape orientations

---

##  Development Process

1. **Fetch Real-Time Price**  
   - Uses **CoinLayer API** to retrieve the current price of BTC.
   - Updates occur every 60 seconds using a coroutine loop.

2. **7-Day Historical Chart**  
   - Pulls price history from **CoinGecko** to prefill a chart.
   - Renders a line chart with dynamic min/max labels.

3. **Price Direction Indicator**  
   - Displays up/down animation using Lottie based on price movement compared to the previous value.

4. **UI Enhancements**  
   - BTC logo and custom animations 
   - Dynamically adjusts layout and chart dimensions for both orientations.
     
---

##  Challenges Faced

- Learning how to **integrate with CoinLayer API** to fetch current BTC prices
- Understanding **how to retrieve and parse historical price data** from CoinGecko’s REST API
- Integrating **Lottie animation JSON files** as feedback elements in a reactive UI
- Building a chart from raw price data using Jetpack Compose's `Canvas`
- Maintaining **state updates and visual accuracy** in a UI that refreshes every 60 seconds

---

##  Tech Stack

-  **Kotlin**
-  **Jetpack Compose**
-  **CoinLayer API** – real-time prices
-  **CoinGecko API** – historical market chart data
-  **Material 3**
-  **Lottie (Airbnb)** – animated feedback
-  **OkHttp & Retrofit** – HTTP and API integration

---

##  Screenshots

![image](https://github.com/user-attachments/assets/41d49bef-4e8a-4a87-9e2a-2866f0fe1719)

