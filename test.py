import streamlit as st
import pandas as pd
import plotly.express as px

# =======================================================
# 1. DATA SIMULATION (Replace this with your actual data loading)
# =======================================================
# We create a sample DataFrame to simulate data in different categories
@st.cache_data
def load_data():
    """Loads and simulates data for the dashboard."""
    data = {
        'Category': ['Apples', 'Bananas', 'Oranges', 'Grapes', 'Kiwi'],
        'Region': ['North', 'South', 'East', 'West', 'North'],
        'Sales': [4500, 6200, 3100, 5500, 2900],
        'Profit': [1200, 1800, 700, 1500, 800]
    }
    df = pd.DataFrame(data)
    return df

# Load the data once
df = load_data()

# =======================================================
# 2. DASHBOARD SETUP
# =======================================================

# Set the title and a descriptive header
st.title("🍍 Fruit Sales Performance Dashboard 🍇")
st.markdown("---")
st.caption("This dashboard visualizes sales and profit distribution using interactive pie charts.")


# =======================================================
# 3. SIDEBAR FILTERS (Enhancing Dashboard UX)
# =======================================================

st.sidebar.header("📊 Filters")

# Allow users to filter by region
selected_region = st.sidebar.selectbox(
    "Select Region:",
    options=['All', 'North', 'South', 'East', 'West']
)

# Filter the DataFrame based on the selected region
if selected_region == 'All':
    filtered_df = df
else:
    filtered_df = df[df['Region'] == selected_region]


# =======================================================
# 4. VISUALIZATION (The Pie Charts)
# =======================================================

st.header("📊 Key Performance Indicators (KPIs)")
col1, col2, col3 = st.columns(3)

# Display simple metrics
with col1:
    st.metric("Total Revenue", f"${df['Sales'].sum():,.0f}")
with col2:
    st.metric("Total Profit", f"${df['Profit'].sum():,.0f}")
with col3:
    st.metric("Unique Categories", len(df['Category'].unique()))


# --- Chart 1: Sales Distribution by Category (Main Pie Chart) ---
st.header("💰 Sales Distribution by Category")
st.write("This chart shows what percentage of total sales each category contributed.")

# Use Plotly Express for interactive charts
fig_sales = px.pie(
    filtered_df,
    values='Sales',
    names='Category',
    title='Sales Percentage Breakdown',
    hole=0.3 # Creates a donut chart effect
)
st.plotly_chart(fig_sales, use_container_width=True)


# --- Chart 2: Profit Distribution by Category ---
st.header("💰 Profit Contribution by Category")
st.write("This chart visualizes the profit contribution of each category.")

fig_profit = px.pie(
    filtered_df,
    values='Profit',
    names='Category',
    title='Profit Percentage Breakdown',
    hole=0.3
)
st.plotly_chart(fig_profit, use_container_width=True)


# =======================================================
# 5. DATA TABLE (Providing the Raw Data View)
# =======================================================
st.markdown("---")
st.subheader("Raw Data Table")
st.dataframe(filtered_df)