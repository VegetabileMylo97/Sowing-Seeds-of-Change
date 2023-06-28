Public Class SowingSeedsOfChange
    Inherits System.Windows.Forms.Form

    Private Sub SowingSeedsOfChange_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load

        'Set Form properties
        Me.Text = "Sowing Seeds of Change"
        Me.BackColor = Color.White

    End Sub

    Private Sub btnSubmit_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnSubmit.Click

        'Declare variables
        Dim strName As String
        Dim strDonation As String
        Dim shrdDonations As Short
        Dim decDonation As Decimal

        'Read Input
        strName = txtName.Text
        strDonation = txtDonation.Text

        'Validate Input
        If IsNumeric(strDonation) Then
            shrdDonations = CShort(strDonation)
            decDonation = CDec(strDonation)
            'Process Input
            'Display Message
            MessageBox.Show("Thank you for your donation, " & strName & "!", _
            "Donation Received", MessageBoxButtons.OK, _
            MessageBoxIcon.Information)

            'Set Focus
            txtName.Focus()

            'Clear fields
            txtName.Clear()
            txtDonation.Clear()

        Else
            'Display Error Message
            MessageBox.Show("Please enter a valid amount!", _
            "Entry Error", MessageBoxButtons.OK, _
            MessageBoxIcon.Exclamation)

            'Set Focus
            txtDonation.Focus()

        End If

    End Sub

    Private Sub btnClear_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnClear.Click

        'Clear fields
        txtName.Clear()
        txtDonation.Clear()

        'Set Focus
        txtName.Focus()

    End Sub

    Private Sub btnExit_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnExit.Click

        'Close the form
        Me.Close()

    End Sub

End Class