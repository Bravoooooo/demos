#!/usr/bin/env python
# -*- coding: utf-8 -*-

from django import forms


class CommentForm(forms.Form):
    comment = forms.CharField(label='', widget=forms.Textarea(attrs={'cols': '60', 'rows': '6'}))
