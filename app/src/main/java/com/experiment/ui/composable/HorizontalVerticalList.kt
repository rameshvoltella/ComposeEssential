package com.experiment.ui.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun AppListItem() {

    Column(modifier = Modifier.width(60.dp)) {

        AsyncImage(
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .width(50.dp)
                .height(50.dp),
            contentDescription = "images",
            model = "https://play-lh.googleusercontent.com/gU9NKwpgLDYA6LIYK4dnkAkVyqNHUfTIqklEiNuO4oZ2OCpWQhQdqhnDh8Yb9B8SWIM=s96"
        )
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(20.dp)
        )
        Text(text = "App Name")

    }


}

@Composable
fun AppHorizontalList(modifier: Modifier = Modifier) {

    LazyRow(
        modifier = modifier
            .fillMaxWidth()
            .wrapContentHeight()
    ) {

        items(20) {
            AppListItem()
        }

    }


}

@Composable
fun AppVerticalList(modifier: Modifier = Modifier) {

    LazyColumn(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {

        items(20) {
            AppHorizontalList()
            Spacer(modifier = Modifier.fillMaxWidth().width(40.dp))
        }

    }


}

@Preview(showBackground = true)
@Composable
fun preview() {
    AppHorizontalList()
}