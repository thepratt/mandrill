package com.aristocrat.mandrill.requests

// type must start with "image/"
case class Image(`type`: String, name: String, content: String)
