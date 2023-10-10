package com.example.clickbaitapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.clickbaitapp.data.DataSource
import com.example.clickbaitapp.model.ClickBait
import com.example.clickbaitapp.ui.theme.ClickbaitAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ClickbaitAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ClickBaitApp()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun  ClickBaitTopAppBar(modifier: Modifier = Modifier) {
    TopAppBar(
        title = {
                Text(
                    text = "Top Headlines",
                    style = MaterialTheme.typography.displayMedium
                )
            }
    )
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ClickBaitApp() {
    Scaffold(
        topBar = {
            ClickBaitTopAppBar()
        }
    ) { paddingValues ->
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            contentPadding = paddingValues
        ) {
            items(DataSource.clickBaits) {
                ClickBaitItem(
                    clickBait = it,
                    modifier = Modifier.padding(5.dp),
                )
            }
        }
    }
}


@Composable
fun ClickBaitItem(
    clickBait: ClickBait,
    modifier: Modifier = Modifier
) {

    Card(modifier = modifier) {
            Column( modifier = Modifier.height(315.dp),
                verticalArrangement = Arrangement.SpaceBetween) {
                Image(
                    painter = painterResource(id = clickBait.imageResourceId),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                )

                Text(
                    text = stringResource(id = clickBait.publisher),
                    style = MaterialTheme.typography.displayMedium,
                    modifier = Modifier.padding(start = 16.dp, end= 16.dp)
                )

                Text(
                    text = stringResource(id = clickBait.stringResourceId1),
                    style = MaterialTheme.typography. bodyLarge,
                    maxLines = 4,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.padding(start = 16.dp, end= 17.dp)
                    )

                Divider(
                    modifier = Modifier
                )

                Text(
                    text = stringResource(id = clickBait.stringResourceId2),
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(bottom = 10.dp, start = 16.dp)
                )
            }
        }
        }




@Preview
@Composable
fun  ClickBaitCardPreview() {
    ClickbaitAppTheme {
        ClickBaitItem(clickBait = DataSource.clickBaits[0])
    }
}



@Preview
@Composable
fun  ClickBaitPreview() {
   ClickbaitAppTheme {
       ClickBaitApp()
    }
}

@Preview
@Composable
fun  ClickBaitDarkThemePreview() {
    ClickbaitAppTheme(darkTheme = true) {
        ClickBaitApp()
    }
}